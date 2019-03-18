package com.one.service.impl;

import com.one.dao.PersonMapper;
import com.one.entity.Person;
import com.one.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: guopengxia
 * @Date: 2019/3/17 13:03
 * @Version: 1.0
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonMapper personMapper;

    public Person getPerson(int id){
        return personMapper.selectByPrimaryKey(id);
    }
}
