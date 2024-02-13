package com.example.study.service

import com.example.study.dto.OrderListResponseDto
import com.example.study.repository.OrderRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class OrderService(val orderRepository: OrderRepository) {

    @Transactional(readOnly = true)
    fun getOrderListByMemberId(memberId: Long): OrderListResponseDto {
        val list = orderRepository.getOrderListByMemberId(memberId)
        if (list.isEmpty()) {
            return OrderListResponseDto(memberId = 0, memberName = "", list = listOf())
        }
        return OrderListResponseDto(
            list[0].memberId,
            list[0].memberName,
            list.map { OrderListResponseDto.OrderInfo(it.orderId, it.itemName, it.amount) }
        )
    }
}
