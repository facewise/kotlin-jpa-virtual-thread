package com.example.study.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Item(
    @Id
    var id: Long,
    var name: String
)