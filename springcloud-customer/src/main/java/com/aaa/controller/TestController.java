package com.aaa.controller;

import com.aaa.dao.PorductUserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class TestController {
    @Resource
    PorductUserService porductUserService;

//    配置对应的controller层的路径入口
    @RequestMapping("test")
    public String test(){
        return porductUserService.getUser();
    }

    @RequestMapping("findAll")
    public String findAll(){
        return porductUserService.findAll();
    }

    @RequestMapping(value="add",method = RequestMethod.POST)
    public int add(@RequestBody String stus){
        System.out.println("stus:"+stus);
        return porductUserService.add(stus);
    }

    @RequestMapping(value="delete",method = RequestMethod.POST)
    public int delete(@RequestBody Map<String,Object> map){
        Integer id = (Integer) map.get("id");
        System.out.println("map:"+id);
        return porductUserService.delete(map);
    }

    @RequestMapping(value="update",method = RequestMethod.POST)
    public int update(@RequestBody String stus){
        System.out.println("update:"+stus);
        return porductUserService.update(stus);
    }


    @RequestMapping("selecta")
    public String selecta(){
        return porductUserService.selecta();
    }

    @RequestMapping("getUsera")
    public String getUsera(){
        return porductUserService.getUsera();
    }


    @RequestMapping("selectb")
    public String selectb(){
        return porductUserService.selectb();
    }
}
