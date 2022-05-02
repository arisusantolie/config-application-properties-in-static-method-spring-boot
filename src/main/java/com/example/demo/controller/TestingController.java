package com.example.demo.controller;

import com.example.demo.utils.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Credit By : Ari Susanto Lie
website : https://arisusantolie.my.id
 */

@RestController
@RequestMapping("testing-application-properties-static-class")
public class TestingController {

    @GetMapping
    public String getValueConfigAppPropertiesStaticMethod(){
        return Utils.processStatic();
    }

}
