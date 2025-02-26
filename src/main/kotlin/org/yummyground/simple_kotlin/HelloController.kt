package org.yummyground.simple_kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping
    fun hello(): String {
        return "Hello Controller - common method"
    }

    @GetMapping("/inline")
    fun hellInline(): String = "Hello Controller - inline method"

}