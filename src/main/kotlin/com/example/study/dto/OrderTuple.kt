package com.example.study.dto

import com.querydsl.core.annotations.QueryProjection

data class OrderTuple @QueryProjection constructor(
    var orderId: Long,
    var memberId: Long,
    var itemId: Long,
    var memberName: String,
    var itemName: String,
    var amount: Int
)
