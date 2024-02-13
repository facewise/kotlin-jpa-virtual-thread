package com.example.study.repository

import com.example.study.dto.OrderTuple
import com.example.study.dto.QOrderTuple
import com.example.study.entity.QItem.item
import com.example.study.entity.QMember.member
import com.example.study.entity.QOrders.orders
import com.querydsl.jpa.impl.JPAQueryFactory
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Repository

@Repository
class OrderRepository(val queryFactory: JPAQueryFactory) {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun getOrderListByMemberId(memberId: Long): List<OrderTuple> {

        log.info("VT : ${Thread.currentThread().isVirtual}")

        return queryFactory
            .select(
                QOrderTuple(
                    orders.id.`as`("orderId"),
                    member.id.`as`("memberId"),
                    item.id.`as`("itemId"),
                    member.name.`as`("memberName"),
                    item.name.`as`("itemName"),
                    orders.amount.`as`("amount"),)
            )
            .from(
                orders,
                member,
                item,
            )
            .where(
                member.id.eq(memberId),
                orders.memberId.eq(member.id),
                orders.itemId.eq(item.id),
            )
            .fetch()
    }
}
