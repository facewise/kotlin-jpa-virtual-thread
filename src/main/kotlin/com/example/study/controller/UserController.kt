package com.example.study.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @GetMapping
    fun get(): String {
        log.info("in")
        Thread.sleep(100)
        log.info("out")
        return "ok"
    }
}
