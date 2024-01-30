package com.example.study.controller

import com.example.study.repository.UserRepository
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userRepository: UserRepository) {

}
