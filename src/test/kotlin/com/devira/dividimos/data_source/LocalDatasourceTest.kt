package com.devira.dividimos.data_source

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LocalDatasourceTest {

    private val localDatasource: LocalDatasource = LocalDatasourceImpl()

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
        Assertions.assertThat(dishes).isEmpty()
    }

    @Test
    fun shouldProvideADishObjectOrNull() {
        //act
        val dish = localDatasource.getDishesById(dishId = "123456789")
        val nullDish = localDatasource.getDishesById(dishId = "")

        //assert
        Assertions.assertThat(nullDish).isNull()
        Assertions.assertThat(dish).isNotNull
    }

    @Test
    fun shouldProvideAListOfGuests() {
        //act
        val guest = localDatasource.getGuests()

        //assert
        Assertions.assertThat(guest).isEmpty()
    }

    @Test
    fun shouldProvideAGuestObjectOrNull() {
        //act
        val guest = localDatasource.getGuestById(guestId = "123456789")
        val nullGuest = localDatasource.getGuestById(guestId = "")

        //assert
        Assertions.assertThat(nullGuest).isNull()
        Assertions.assertThat(guest).isNotNull
    }
}