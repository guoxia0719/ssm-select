package com.one.dao;

import com.one.entity.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Person record);
}