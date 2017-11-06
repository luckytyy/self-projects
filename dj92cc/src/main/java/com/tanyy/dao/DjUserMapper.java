package com.tanyy.dao;

import com.tanyy.model.DjUser;
import com.tanyy.model.DjUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjUserMapper {
    int countByExample(DjUserExample example);

    int deleteByExample(DjUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjUser record);

    int insertSelective(DjUser record);

    List<DjUser> selectByExample(DjUserExample example);

    DjUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjUser record, @Param("example") DjUserExample example);

    int updateByExample(@Param("record") DjUser record, @Param("example") DjUserExample example);

    int updateByPrimaryKeySelective(DjUser record);

    int updateByPrimaryKey(DjUser record);
}