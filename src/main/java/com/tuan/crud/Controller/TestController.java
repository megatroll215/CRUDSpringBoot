package com.tuan.crud.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "test")
public class TestController {
    @GetMapping("")
    public String TestHello(){
        return "index";
    }
}
