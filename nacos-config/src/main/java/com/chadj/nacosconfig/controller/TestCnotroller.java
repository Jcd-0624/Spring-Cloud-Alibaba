package com.chadj.nacosconfig.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Reference
@RequestMapping("test")
public class TestCnotroller {

    @Value("${author.name}")
    private String name;

    @GetMapping
    public String test() {
        return "nacos配置的作者" + name;
    }
}
