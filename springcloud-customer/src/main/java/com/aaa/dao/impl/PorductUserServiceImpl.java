package com.aaa.dao.impl;

import com.aaa.dao.PorductUserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class PorductUserServiceImpl implements PorductUserService {
    //当没有找到对应配置的路径时，返回的结果
    public String getUser() {
        return "没有查到用户信息";
    }

    public String findAll() {
        return null;
    }

    public int add(String stus) {
        return 0;
    }

    public int delete(Map<String, Object> map) {
        return 0;
    }

    public int update(String stus) {
        return 0;
    }

    public String selecta() {
        return null;
    }

    public String getUsera() {
        return null;
    }

    public String selectb() {
        return null;
    }

}
