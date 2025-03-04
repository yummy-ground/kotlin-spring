package org.yummyground.simple_kotlin

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.jvm.jvmName

@RestController
class HelloController(
    val loggerForSimpleName: Logger = LoggerFactory.getLogger(HelloController::class.simpleName),
    val loggerForQualifiedName: Logger = LoggerFactory.getLogger(HelloController::class.qualifiedName),
    val loggerForJvmName: Logger = LoggerFactory.getLogger(HelloController::class.jvmName)
) {

    @GetMapping
    fun hello(): String {
        loggerForSimpleName.error("Logging Test on Spring Application")
        loggerForQualifiedName.error("Logging Test on Spring Application")
        loggerForJvmName.error("Logging Test on Spring Application")
        return "Hello Controller - common method"
    }

    @GetMapping("/inline")
    fun hellInline(): String = "Hello Controller - inline method"

}