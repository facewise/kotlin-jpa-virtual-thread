package com.example.study.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Member(
    @Id
    var id: Long,
    var name: String
)