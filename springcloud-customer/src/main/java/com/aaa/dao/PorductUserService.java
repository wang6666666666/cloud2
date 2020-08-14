package com.aaa.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import com.aaa.dao.impl.PorductUserServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

// 获取SPRINGCLOUD-PORDUCT服务下得
@FeignClient(value="SPRINGCOULD-ZUUL")
public interface PorductUserService {
    // 映射生产者对应得方法请求路径
    //配置对应的路径
    @RequestMapping("/pts/user/getUser")
    String getUser();

    @RequestMapping("/pts/stus/findAll")
    String findAll();

    @RequestMapping("/pts/stus/add")
    int add(@RequestParam("stus") String stus);

    @RequestMapping("/pts/stus/delete")
    int delete(@RequestParam("map") Map<String,Object> map);

    @RequestMapping("/pts/stus/update")
    int update(@RequestParam("stus") String stus);


    @RequestMapping("/pta/user/select")
    String selecta();

    @RequestMapping("/pta/user/getUser")
    String getUsera();


    @RequestMapping("/ptb/user/select")
    String selectb();

}
