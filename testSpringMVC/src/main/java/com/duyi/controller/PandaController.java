package com.duyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PandaController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test(){
        System.out.println("===========");
    }
}
