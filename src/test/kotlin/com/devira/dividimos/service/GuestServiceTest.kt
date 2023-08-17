package com.devira.dividimos.service

import com.devira.dividimos.data_source.LocalDatasourceOld
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class GuestServiceTest {

    private val datasource: LocalDatasourceOld = mockk(relaxed = true)
    private val guestService: GuestService = GuestService(datasource = datasource)

    @Test
    fun shouldCallDatasourceToRetrieveListOfGuests() {

        //act
        guestService.getGuests()

        //assert
        verify(exactly = 1) { datasource.getGuests() }
    }

    @Test
    fun shouldCallDatasourceToRetrieveListASingleGuest() {

        //act
        guestService.getGuestById(guestId = "123456789")

        //assert
        verify(exactly = 1) { guestService.getGuestById(guestId = "123456789") }
    }
}