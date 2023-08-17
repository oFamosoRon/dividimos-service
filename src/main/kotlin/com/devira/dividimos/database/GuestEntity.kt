package com.devira.dividimos.database

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "guests")
class GuestEntity(
    var name: String,
    var owes: Double,
    var hasPaid: Boolean,
    var itemsShared: List<String>,
    var email: String? = null,
    var phone: String? = null,
    var pictureUrl: String? = null,
    @Id @GeneratedValue var id: Long? = null,
)