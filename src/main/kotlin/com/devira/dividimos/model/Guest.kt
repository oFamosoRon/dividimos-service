package com.devira.dividimos.model

data class Guest(
    val id: String,
    val name: String,
    val owes: Double,
    val email: String?,
    val phone: String?,
    val hasPaid: Boolean,
    val pictureUrl: String?,
    val itemsShared: List<String>,
)