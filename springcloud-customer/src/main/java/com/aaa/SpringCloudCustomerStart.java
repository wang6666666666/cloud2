package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// 将当前应用程序注册为feign得客户端程序
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudCustomerStart {
    public static void main(String[] args){
        SpringApplication.run(SpringCloudCustomerStart.class);
    }

    //注册为spring的一个bean，方法得返回结果
    //RestTemplate会拦截http请求（请求的是服务名），交给对应的拦截器进行处理，根据负载均衡册罗，将请求转换具体得服务器url访问路径
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
