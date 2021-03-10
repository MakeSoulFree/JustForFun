package com.wlx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wlx
 * @version 1.0
 * @date 2021/3/10 0010 21:28
 */
@RestController
public class HelloController implements IHelloController{

    public String hello(){
        return "hello";
    }
}
