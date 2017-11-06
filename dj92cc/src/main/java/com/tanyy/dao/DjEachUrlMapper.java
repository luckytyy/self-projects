package com.tanyy.dao;

import com.tanyy.model.DjEachUrl;
import com.tanyy.model.DjEachUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjEachUrlMapper {
    int countByExample(DjEachUrlExample example);

    int deleteByExample(DjEachUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjEachUrl record);

    int insertSelective(DjEachUrl record);

    List<DjEachUrl> selectByExample(DjEachUrlExample example);

    DjEachUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjEachUrl record, @Param("example") DjEachUrlExample example);

    int updateByExample(@Param("record") DjEachUrl record, @Param("example") DjEachUrlExample example);

    int updateByPrimaryKeySelective(DjEachUrl record);

    int updateByPrimaryKey(DjEachUrl record);
}