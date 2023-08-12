package com.devira.dividimos.model

data class Table(
    val id: String,
    val total: Double,
    val serviceFee: Double?,
    val couvertFee: Double?,
    val guests: List<String>,
    val dishes: List<String>,
)