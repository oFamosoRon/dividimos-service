package com.devira.dividimos.database

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class TableEntity(
    var total: Double,
    var serviceFee: Double?,
    var couvertFee: Double?,
    var guests: List<String>,
    var dishes: List<String>,
    @Id @GeneratedValue var id: String? = null,
)