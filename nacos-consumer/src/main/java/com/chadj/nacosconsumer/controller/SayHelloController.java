package com.chadj.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class SayHelloController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("hello")
    public String sayHelloToChadJ() {

        // 负载均衡选取
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-producer");

        // 拼接参数
        String url = serviceInstance.getUri() + "/hello?name=" + "ChadJ";

        RestTemplate restTemplate = new RestTemplate();

        String result = restTemplate.getForObject(url, String.class);

        return "请求" + url + ", return : " + result;

    }
}
