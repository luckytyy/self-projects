package com.tanyy.dao;

import com.tanyy.model.DjTotalUrl;
import com.tanyy.model.DjTotalUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjTotalUrlMapper {
    int countByExample(DjTotalUrlExample example);

    int deleteByExample(DjTotalUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjTotalUrl record);

    int insertSelective(DjTotalUrl record);

    List<DjTotalUrl> selectByExample(DjTotalUrlExample example);

    DjTotalUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjTotalUrl record, @Param("example") DjTotalUrlExample example);

    int updateByExample(@Param("record") DjTotalUrl record, @Param("example") DjTotalUrlExample example);

    int updateByPrimaryKeySelective(DjTotalUrl record);

    int updateByPrimaryKey(DjTotalUrl record);
}