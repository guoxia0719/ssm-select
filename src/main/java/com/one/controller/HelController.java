package com.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: guopengxia
 * @Date: 2019/3/17 9:43
 * @Version: 1.0
 */

@Controller
@RequestMapping("/hello")
public class HelController {

    @RequestMapping("/get")
    public String getLoc(){
        System.out.print("执行HelController类中的getLoc方法");
        return "Hello";
    }
}
