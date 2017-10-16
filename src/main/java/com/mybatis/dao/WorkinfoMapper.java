package com.mybatis.dao;

import com.mybatis.model.Workinfo;

public interface WorkinfoMapper {
    int deleteByPrimaryKey(Long workid);

    int insert(Workinfo record);

    int insertSelective(Workinfo record);

    Workinfo selectByPrimaryKey(Long workid);

    int updateByPrimaryKeySelective(Workinfo record);

    int updateByPrimaryKey(Workinfo record);
}