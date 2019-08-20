package com.chadj.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @Description: 使用WebClient负载均衡调用
 * @Create: 2019/8/20 14:26
 * @Author ChadJ
 */
@RestController
@RequestMapping("web_client")
public class WebClientController {

    @Bean
    @LoadBalanced
    public WebClient.Builder loadBalanceWebClientBuilder() {
        return WebClient.builder();
    }

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping()
    public Mono<String> sayHello() {
        Mono<String> result = webClientBuilder.build()
                .get()
                .uri("http://nacos-producer/hello?name=ChadJ")
                .retrieve()
                .bodyToMono(String.class);
        return result;
    }

}
