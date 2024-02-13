package com.example.study.controller

import com.example.study.dto.OrderListResponseDto
import com.example.study.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController(val orderService: OrderService) {

    @GetMapping("/orders/{memberId}")
    fun get(@PathVariable memberId: Long): OrderListResponseDto {
        return orderService.getOrderListByMemberId(memberId)
    }
}
