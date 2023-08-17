package com.devira.dividimos.database

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class DishEntity(
    var qnt: Int,
    var name: String,
    var price: Double,
    var tableId: String,
    @Id @GeneratedValue var id: String? = null,
)