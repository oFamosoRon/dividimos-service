package com.devira.dividimos.data_source

import com.devira.dividimos.model.Dish
import com.devira.dividimos.model.Guest
import com.devira.dividimos.model.Table
import org.springframework.stereotype.Repository

/*
*  TODO
*  refactor -> this is going to get data from the DATABASE
* */

@Repository
class LocalDatasourceImplOld(

) : LocalDatasourceOld {
    private val table = Table(
        id = "123456789",
        total = 10.0,
        serviceFee = 1.0,
        couvertFee = 1.0,
        guests = emptyList(),
        dishes = emptyList()
    )

    private val dish = Dish(
        qnt = 1,
        id = "123456789",
        name = "dish",
        price = 10.0,
        tableId = "123456789"
    )

    private val guest = Guest(
        id = 123456789,
        name = "guest",
        owes = 10.0,
        email = null,
        phone = null,
        pictureUrl = null,
        hasPaid = false,
        itemsShared = emptyList()
    )

    override fun getTable(tableId: String): Table? {
        return if (tableId == "") {
            null
        } else {
            table
        }
    }

    override fun getGuests(): List<Guest> = listOf(guest)

    override fun getGuestById(guestId: String): Guest {
        if (guestId != "123456789") {
            throw NoSuchElementException("Element not found")
        }

        return guest
    }

    override fun getDishes(): List<Dish> = listOf(dish)

    override fun getDishesById(dishId: String): Dish {
        if (dishId != "123456789") {

            throw NoSuchElementException("Element not found")
        }

        return dish
    }

}