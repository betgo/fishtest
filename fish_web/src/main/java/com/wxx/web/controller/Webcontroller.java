package com.wxx.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description //TODO
 * @Date 2019/3/11 11:39
 * @Author wxx
 **/
@Controller
public class Webcontroller {

    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
}
