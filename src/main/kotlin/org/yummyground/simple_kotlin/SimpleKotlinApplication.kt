package org.yummyground.simple_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleKotlinApplication

fun main(args: Array<String>) {
	runApplication<SimpleKotlinApplication>(*args)
}
