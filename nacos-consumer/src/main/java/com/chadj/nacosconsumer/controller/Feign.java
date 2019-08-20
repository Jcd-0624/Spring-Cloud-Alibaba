package com.chadj.nacosconsumer.controller;

import com.chadj.nacosconsumer.fegin.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class Feign {
    @Autowired
    HelloClient helloClient;

    @GetMapping
    public String test() {
        String result = helloClient.hello("ChadJ");
        return "Return : " + result;
    }

}
