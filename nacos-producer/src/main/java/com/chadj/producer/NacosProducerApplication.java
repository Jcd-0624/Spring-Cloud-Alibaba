package com.chadj.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: 应用主类
 * @Create: 2019/8/20 10:55
 * @Author ChadJ
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosProducerApplication.class, args);
	}

}
