package com.demo.provider.controller;

import com.demo.provider.entity.result.User;
import com.demo.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * demo-provider的测试
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "getMyName")
    public String getMyName(){
        return testService.getMyName();
    }

    @PostMapping(value = "insertUser")
    public void insertUser(@RequestBody User user){
        testService.insertUser(user);
    }
}
