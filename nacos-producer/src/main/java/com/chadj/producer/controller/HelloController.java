package com.chadj.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: 生产者接口</p>
 * <p>Copyright: Copyright (c)2019</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019-08-20</P>
 * <P>@version 1.0</P>
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String sayHello(String name){
        return "hello " + name;
    }
}
