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
class LocalDatasourceImpl: LocalDatasource {
    override fun getTable(tableId: String): Table? {
        return if(tableId == "") {
            null
        } else {
            Table(
                id = "123456789",
                total = 10.0,
                serviceFee = 1.0,
                couvertFee = 1.0,
                guests = emptyList(),
                dishes = emptyList()
            )
        }
    }

    override fun getGuests(): List<Guest> {
        TODO("Not yet implemented")
    }

    override fun getGuestById(guestId: String): Guest {
        TODO("Not yet implemented")
    }

    override fun getDishes(): List<Dish> = listOf()

    override fun getDishesById(dishId: String): Dish? {
        if (dishId == "") return null

        return Dish(
            qnt = 1,
            id = "123456789",
            name = "dish",
            price = 10.0,
            tableId = "123456789"
        )
    }

}