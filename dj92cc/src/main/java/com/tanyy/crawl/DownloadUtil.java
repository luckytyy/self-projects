package com.tanyy.crawl;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.LoggerFactory;

import com.tanyy.dao.DjEachUrlMapper;
import com.tanyy.dao.DjRecordMapper;
import com.tanyy.dao.DjTotalUrlMapper;
import com.tanyy.domain.DJType;
import com.tanyy.model.DjEachUrl;
import com.tanyy.model.DjEachUrlExample;
import com.tanyy.model.DjRecord;
import com.tanyy.model.DjRecordExample;
import com.tanyy.model.DjTotalUrl;
import com.tanyy.model.DjTotalUrlExample;
import com.tanyy.util.CommonParametersGetter;
import com.tanyy.util.DateUtil;

public class DownloadUtil {

  private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DownloadUtil.class);

  public static final String CHUANSHAO_START_URL = "list/1";
  public static final String CHINESE_SINGLE_START_URL = "list/3";
  public static final String ENGLISH_SINGLE_START_URL = "list/5";
  public static final String[] urls = { CHUANSHAO_START_URL, ENGLISH_SINGLE_START_URL, CHINESE_SINGLE_START_URL };

  public static final String WEB_HEAD = "http://www.dj92cc.com/";
  public static final String DOWNLOAD_WEB_HEAD = "http://i.dj92cc.com/";
  public static final String OUTPUT_DIR = "E:\\my92cc";

  public static String generateDownloadUrl(String songId, String userId) {
    StringBuilder sb = new StringBuilder();
    if (StringUtils.isNotEmpty(songId) && StringUtils.isNotEmpty(userId)) {
      sb.append(DOWNLOAD_WEB_HEAD).append(userId).append("/dance/d").append(songId).append(".html");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Document document = null;
    DjRecordMapper djRecordMapper = SpringContextUtil.getInstance().getBean(DjRecordMapper.class);
    DjTotalUrlMapper djTotalUrlMapper = SpringContextUtil.getInstance().getBean(DjTotalUrlMapper.class);
    DjEachUrlMapper djEachUrlMapper = SpringContextUtil.getInstance().getBean(DjEachUrlMapper.class);

    for (String temp : urls) {
      int flag = 0;
      // if(temp.equals(CHINESE_SINGLE_START_URL)){
      // continue;
      // }
      if (temp.equals(CHUANSHAO_START_URL)) {
        flag = 1;
      } else if (temp.equals(ENGLISH_SINGLE_START_URL)) {
        flag = 2;
      } else if (temp.equals(CHINESE_SINGLE_START_URL)) {
        flag = 3;
      }
      DjTotalUrlExample example = new DjTotalUrlExample();
      example.createCriteria().andTypeEqualTo(flag);
      example.setOrderByClause(" create_time desc ");
      DjTotalUrl totalUrl = null;
      List<DjTotalUrl> urlList = djTotalUrlMapper.selectByExample(example);
      if (urlList != null && urlList.size() > 0) {
        totalUrl = urlList.get(0);
        if (totalUrl.getStatus().equals(0)) {
          logger.info("{} total has not finish,status = {}", temp, totalUrl.getStatus());
          continue;
        }
      }

      if (totalUrl == null) { // 一条记录都没有
        String firstPageTemp = temp + "/1/";
        String headUrl = WEB_HEAD + firstPageTemp;
        try {
          document = Jsoup.connect(headUrl).userAgent(CommonParametersGetter.getRandomUserAgents())
              .timeout(CommonParametersGetter.CONNECTION_TIME_OUT).get();

          if (document == null) {
            logger.info("network error,{} can not find document ", firstPageTemp);
            continue;
          }

          totalUrl = new DjTotalUrl();
          totalUrl.setType(flag);
          totalUrl.setStatus(0);

          String totalStr = document.select(".definition").text();
          String totalPageStr = document.select(".other .pageNum").attr("value");
          String total = "";
          if (StringUtils.isNotEmpty(totalStr)) {
            total = totalStr.substring(totalStr.indexOf("（") + 1, totalStr.lastIndexOf("）"));
          }
          Integer totalCount = 0;
          Integer totalPageCount = 0;
          try {
            totalCount = Integer.parseInt(total);
          } catch (NumberFormatException e) {
            e.printStackTrace();
          }
          try {
            totalPageCount = Integer.parseInt(totalPageStr);
          } catch (NumberFormatException e1) {
            e1.printStackTrace();
          }

          totalUrl.setTotalCount(totalCount);
          totalUrl.setTotalPage(totalPageCount);
          totalUrl.setSuccessPage(0);
          totalUrl.setSucessCount(0);
          totalUrl.setCreateTime(new Date());

          String timeStr = document.select(".share_list li").eq(1).select(".time").text();
          try {
            Date uploadDate = DateUtil.convertStringToDate("yyyy-MM-dd", timeStr);
            totalUrl.setRecentSongTime(uploadDate);
          } catch (ParseException e) {
            e.printStackTrace();
          }
          djTotalUrlMapper.insertSelective(totalUrl);
          for (int i = 1; i <= totalPageCount; i++) {
            DjEachUrl each = new DjEachUrl();
            each.setCreateTime(new Date());
            each.setStatus(0);
            each.setExtractCount(0);
            each.setDjType(flag);
            each.setTotalId(totalUrl.getId());
            StringBuilder sb = new StringBuilder();
            sb.append(WEB_HEAD).append(temp).append("/").append(i);
            each.setPageUrl(sb.toString());
            djEachUrlMapper.insert(each);
          }

          // dealOnePage(document, djRecordMapper);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    // deal with dj eachurl records
//    DjEachUrlExample ex = new DjEachUrlExample();
//    ex.createCriteria().andStatusEqualTo(0);
//    List<DjEachUrl> eachList = djEachUrlMapper.selectByExample(ex);
//    for (DjEachUrl temp : eachList) {
//      try {
//        document = Jsoup.connect(temp.getPageUrl()).userAgent(CommonParametersGetter.getRandomUserAgents())
//            .timeout(CommonParametersGetter.CONNECTION_TIME_OUT).get();
//        dealOnePage(document, djRecordMapper, temp, djEachUrlMapper);
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }

    // query each songs count
    DjRecordExample exDj = new DjRecordExample();
    exDj.createCriteria().andRecomendCountIsNull();
    int totalCount = djRecordMapper.countByExample(exDj);
    int endIndex = 0;
    final int OFFSET = 10;
    for (int i = 1; i <= totalCount && i<=20; i += OFFSET) {
      endIndex = i + OFFSET - 1;
      System.out.println("from ("+(i+1)+" to "+endIndex+")");
      exDj.createCriteria().andIdBetween(i + 1, endIndex).andRecomendCountIsNull();
      List<DjRecord> recordList = djRecordMapper.selectByExample(exDj);
      if (recordList != null && recordList.size() > 0) {
        for (DjRecord temp : recordList) {
          try {
            document = Jsoup.connect(WEB_HEAD + temp.getUrl()).userAgent(CommonParametersGetter.getRandomUserAgents())
                .timeout(CommonParametersGetter.CONNECTION_TIME_OUT).get();
            dealOnePageSongCount(document, djRecordMapper, temp);
          } catch (IOException e) {
            e.printStackTrace();
          }

        }
      }
    }

  }

  private static void dealOnePageSongCount(Document document, DjRecordMapper mapper, DjRecord temp) {
    if (document == null)
      return;
    Elements rows = document.select(".info_list span");
    Iterator<Element> row2 = rows.iterator();
    while (row2.hasNext()) {
      Element e = row2.next();
      System.out.println(e.text());
      // djEachMapper.updateByPrimaryKey(temp);
    }
  }

  private static void dealOnePage(Document document, DjRecordMapper mapper, DjEachUrl temp, DjEachUrlMapper djEachMapper) {
    if (document == null)
      return;
    Elements rows = document.select(".share_list li");
    Iterator<Element> row2 = rows.iterator();
    boolean ok = false;
    int count = 0;
    while (row2.hasNext()) {
      Element e = row2.next();
      String classVal = e.attr("class");
      if ("title".equals(classVal)) {
        continue;
      }

      DjRecord record = new DjRecord();
      record.setSongId(e.select(".cbox input").attr("id"));
      record.setUrl(e.select(".aleft a").attr("href"));
      record.setName(e.select(".aleft a").text());

      Elements tempElement = e.select(".aleft img");
      if (tempElement != null && tempElement.iterator() != null) {
        StringBuilder sb = new StringBuilder();
        Iterator<Element> iter = tempElement.iterator();
        while (iter.hasNext()) {
          Element tempEle = iter.next();
          sb.append(tempEle.attr("title")).append(",");
        }
        record.setCharacters(sb.length() > 1 ? sb.toString().substring(0, sb.toString().length() - 1) : "");
      }
      String style = e.select(".style a").text();
      DJType type = DJType.getDjTypeFromStr(style);
      record.setType(type == null ? -1 : type.getCode());

      record.setLastingTime(e.select(".duration").text());
      record.setQuality(e.select(".tune").text());

      Date uploadDate = null;
      try {
        uploadDate = DateUtil.convertStringToDate("yyyy-MM-dd", e.select(".time").text());
      } catch (ParseException e1) {
        e1.printStackTrace();
      }
      record.setUploadTime(uploadDate);
      record.setCost(e.select(".points").text());

      String s = e.select(".down a").attr("onclick");
      String userId = s.substring(s.indexOf(",") + 2, s.length() - 2);
      record.setUserId(userId);

      record.setDownloadUrl(e.select(".share a").attr("href"));
      record.setDjType(temp.getDjType());
      record.setPageurl(temp.getPageUrl());

      mapper.insert(record);
      count++;
    }

    temp.setExtractCount(count);
    temp.setExtractTime(new Date());
    temp.setStatus(1);
    djEachMapper.updateByPrimaryKey(temp);
  }

}
