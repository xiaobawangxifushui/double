package com.yycompany.nacosproducer.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProController {
    @Value("${myname}")
    private String myName;
    @Value("${redis}")
    private String redis;
    @Value("${jdbc}")
    private String jdbc;
    @GetMapping("/hello")
    public String test(){
        return "producer!==="+myName+"==="+redis+"==="+jdbc;
    }
}
