package com.se452group4.hellospringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author duely
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
