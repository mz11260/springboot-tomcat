package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/3/11.
 */
@RestController
public class TestController {

    @GetMapping("test")
    @ResponseBody
    public String test() {
        return "Hello world";
    }
}
