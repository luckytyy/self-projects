package com.tanyy.dao;

import com.tanyy.model.DjRecord;
import com.tanyy.model.DjRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjRecordMapper {
    int countByExample(DjRecordExample example);

    int deleteByExample(DjRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjRecord record);

    int insertSelective(DjRecord record);

    List<DjRecord> selectByExample(DjRecordExample example);

    DjRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjRecord record, @Param("example") DjRecordExample example);

    int updateByExample(@Param("record") DjRecord record, @Param("example") DjRecordExample example);

    int updateByPrimaryKeySelective(DjRecord record);

    int updateByPrimaryKey(DjRecord record);
}