package com.devira.dividimos.data_source

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertThrows

internal class LocalDatasourceTest {

    private val localDatasource: LocalDatasourceOld = LocalDatasourceImplOld()

    @Test
    fun shouldProvideATableObjectOrNull() {
        //act
        val nullTable = localDatasource.getTable(tableId = "")
        val table = localDatasource.getTable(tableId = "123456789")

        //assert
        Assertions.assertThat(nullTable).isNull()
        Assertions.assertThat(table).isNotNull
    }

    @Test
    fun shouldProvideAListOfDishes() {
        //act
        val dishes = localDatasource.getDishes()

        //assert
        Assertions.assertThat(dishes).size().isGreaterThan(0)
    }

    @Test
    fun shouldProvideADishObjectOrThrowNotFoundException() {
        //act
        val dish = localDatasource.getDishesById(dishId = "123456789")

        //assert
        assertThrows(NoSuchElementException::class.java) {
            localDatasource.getDishesById("1234111")
        }

        Assertions.assertThat(dish).isNotNull
    }

    @Test
    fun shouldProvideAListOfGuests() {
        //act
        val guest = localDatasource.getGuests()

        //assert
        Assertions.assertThat(guest).size().isGreaterThan(0)
    }

    @Test
    fun shouldProvideAGuestObjectOrNull() {
        //act
        val guest = localDatasource.getGuestById(guestId = "123456789")

        //assert
        assertThrows(NoSuchElementException::class.java) {
            localDatasource.getDishesById("1111111")
        }
        Assertions.assertThat(guest).isNotNull
    }
}