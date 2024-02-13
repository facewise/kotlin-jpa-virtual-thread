package com.example.study.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Orders(
    @Id
    var id: Long,
    var memberId: Long,
    var itemId: Long,
    var amount: Int
)