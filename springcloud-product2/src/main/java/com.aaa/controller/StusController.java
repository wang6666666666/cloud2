package com.aaa.controller;


import com.aaa.entity.Stus;
import com.aaa.service.StusService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping("stus")
public class StusController {
    @Resource
    StusService service;

    @RequestMapping("findAll")
    public String findAll(){
        List<Stus> list = service.findAll();
        System.out.println(list);
        String s = JSON.toJSONString(list);
        System.out.println("list:"+s);
        return s;
    }


    @RequestMapping("add")
    public int add(String stus){
        System.out.println("add:"+stus);
        Stus stus1 = JSONObject.parseObject(stus,Stus.class);
        return service.add(stus1);
    }

    @RequestMapping("delete")
    public int delete(Integer id){
        System.out.println("map-id:"+id);
        return service.deleteById(id);
    }

    @RequestMapping("update")
    public int update(String stus){
        Stus stus1 = JSONObject.parseObject(stus,Stus.class);
        System.out.println("stus1:"+stus1);
        return service.update(stus1);
    }
}
