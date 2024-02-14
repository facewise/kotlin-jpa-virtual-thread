package com.example.study.repository

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class OrdersRepositoryTest {

    @Autowired
    lateinit var orderRepository: OrderRepository

    @Test
    fun getOrderListByUserId() {
        val list = orderRepository.getOrderListByMemberId(1)
        println(list)
        assertTrue(list.isNotEmpty())
    }
}
