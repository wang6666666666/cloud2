package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


// 注册成eureka得客户端
// @EnableEurekaClient
// EnableEurekaClient只支持Eureka注册中心，EnableDiscoveryClient支持所有得注册中心
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudPorductStart {
    public static void main(String[] args){
        SpringApplication.run(SpringCloudPorductStart.class);
    }
}
