package com.devira.dividimos.service

import com.devira.dividimos.data_source.GuestDatasource
import com.devira.dividimos.database.GuestEntity
import com.devira.dividimos.model.Guest
import org.springframework.stereotype.Repository

@Repository
class GuestService(private val datasource: GuestDatasource) {

    fun getGuests(): List<Guest> =
        datasource.findAll().map { it.mapToModel() }

    fun getGuestById(guestId: Long): Guest =
        datasource.findById(guestId).get().mapToModel()
}

private fun GuestEntity.mapToModel(): Guest =
    Guest(
        id = id,
        name = name,
        owes = owes,
        email = email,
        phone = phone,
        hasPaid = hasPaid,
        pictureUrl = pictureUrl,
        itemsShared = itemsShared
    )