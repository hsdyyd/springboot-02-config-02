package com.train.springboot.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yidong
 * @since 2019-01-15 20:42
 */
@RestController
public class HelloController {
    /*
    --server.servlet.context-path配置
    ServletWebServerFactoryAutoConfiguration
    ServerProperties.Servlet
    */
    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot";
        
    }
}
