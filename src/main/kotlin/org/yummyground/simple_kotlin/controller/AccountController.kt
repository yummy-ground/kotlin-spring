package org.yummyground.simple_kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import org.yummyground.simple_kotlin.controller.dto.View
import org.yummyground.simple_kotlin.controller.dto.Create

@RestController
@RequestMapping("/accounts")
class AccountController {

    @GetMapping
    fun getAll(): Iterable<View.Account> = listOf(View.Account(id = 1, name = "donggyu"))

    @PostMapping
    fun create(
        @RequestBody createAccount: Create.Account
    ): View.Account {
        // Save Data...
        val savedAccountId = 1L
        return View.Account(id = savedAccountId, name = createAccount.name)
    }

}