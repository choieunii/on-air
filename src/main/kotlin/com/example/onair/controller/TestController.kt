package com.example.onair.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class TestController {
    @RequestMapping("/hello")
    fun index(): String {
        return "hello";
    }
}