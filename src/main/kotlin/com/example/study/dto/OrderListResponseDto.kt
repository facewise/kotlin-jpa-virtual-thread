package com.example.study.dto

data class OrderListResponseDto(
    val memberId: Long,
    val memberName: String,
    val list: List<OrderInfo>
) {
    data class OrderInfo(
        val orderId: Long,
        val itemName: String,
        val amount: Int
    )
}
