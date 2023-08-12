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
    override fun getTable(tableId: String): Table {
        TODO("Not yet implemented")
    }

    override fun getGuests(): List<Guest> {
        TODO("Not yet implemented")
    }

    override fun getGuestById(guestId: String): Guest {
        TODO("Not yet implemented")
    }

    override fun getDishes(): List<Dish> {
        TODO("Not yet implemented")
    }

    override fun getDishesById(dishId: String): Dish {
        TODO("Not yet implemented")
    }

}