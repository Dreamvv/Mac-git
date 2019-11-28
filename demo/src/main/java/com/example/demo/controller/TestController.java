package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liyong
 * @version 1.0
 * @date 2019/11/27 12:04
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public Map a(){
        HashMap map = new HashMap();
        map.put("name","Dream");
        map.put("age",22);
        return map;
    }
}
