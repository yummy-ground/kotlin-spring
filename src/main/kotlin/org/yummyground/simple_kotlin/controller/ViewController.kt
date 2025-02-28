package org.yummyground.simple_kotlin.controller;

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// View Controller (not REST) for testing DevTools
@Controller
@RequestMapping("/static")
class ViewController {

    @GetMapping("/index")
    fun index(): String {
        return "index"
    }

}
