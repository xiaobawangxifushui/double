package com.yycompany.nacosconsumer.controller;


import com.yycompany.nacosconsumer.feign.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CstController {
    @Autowired
    private ProducerClient producerClient;
    @GetMapping("/hi")
    public String test(HttpServletRequest requst){
        String msg = producerClient.test();
        System.out.println(requst.getRequestURL());
        System.out.println(requst.getRequestURI());
        return "consumer!==="+msg;
    }
}
