package com.yycompany.nacosconsumer.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-producer")
public interface ProducerClient {
    @GetMapping("/hello")
    public String test();
}
