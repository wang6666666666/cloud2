package com.aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser")
    public String getUser(){
        return "{\"user\":{\"id\":1,\"name\":张三}}";
    }

    @RequestMapping("select")
    public String getUser2(){
        return "ProductA--负载均衡服务一";
    }


    @RequestMapping("add")
    public Integer add(Integer a,Integer b){
        return a+b;
    }

    @RequestMapping(value = "edit",produces = "application/json")
    public Boolean edit(){
        return true;
    }
}
