package com.wlx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wlx
 * @version 1.0
 * @date 2021/3/10 0010 22:03
 */
@Controller
public interface IHelloController {

    @RequestMapping("/hello")
    public String hello();
}
