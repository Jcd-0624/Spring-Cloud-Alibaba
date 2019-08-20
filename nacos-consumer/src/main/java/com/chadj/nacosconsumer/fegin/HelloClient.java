package com.chadj.nacosconsumer.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("nacos-producer")
public interface HelloClient {

    @GetMapping("hello")
    String hello(@RequestParam(name = "name") String name);
}
