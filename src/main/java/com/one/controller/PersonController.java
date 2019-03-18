package com.one.controller;

import com.one.entity.Person;
import com.one.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Author: guopengxia
 * @Date: 2019/3/17 13:02
 * @Version: 1.0
 */
@Controller
@RequestMapping("/person")
public class PersonController {

     @Resource
     PersonService personService;

     @RequestMapping(value="/select", produces = "text/plain;charset=utf-8")
     public ModelAndView getPerson(@RequestParam("id")String id){
         Person p=personService.getPerson(Integer.parseInt(id));
         ModelAndView mav=new ModelAndView("success");
         mav.addObject("p",p);
         return mav;
     }
}
