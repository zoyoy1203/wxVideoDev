package com.zyuanyuan.dao;

import com.zyuanyuan.model.UsersFans;

public interface UsersFansMapper {
    int deleteByPrimaryKey(String id);

    int insert(UsersFans record);

    int insertSelective(UsersFans record);

    UsersFans selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UsersFans record);

    int updateByPrimaryKey(UsersFans record);
}