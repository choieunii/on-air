package com.example.onair.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ContentsController {
    @GetMapping("/")
    fun index(): String {
        val hello = "Hello World!"
        return hello
    }
}