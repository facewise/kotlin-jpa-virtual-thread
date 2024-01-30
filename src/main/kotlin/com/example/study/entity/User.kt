package com.example.study.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class User(
    @Id
    var id: Int,
    var email: String,
    var name: String?,
    var address: String?,
    var age: Int?
)