package com.devira.dividimos.service

import com.devira.dividimos.data_source.Datasource
import com.devira.dividimos.model.Guest
import org.springframework.stereotype.Repository

@Repository
class GuestService(private val datasource: Datasource) {

    fun getGuests(): List<Guest> =
        datasource.getGuests()

    fun getGuestById(guestId: String): Guest =
        datasource.getGuestById(guestId = guestId)
}