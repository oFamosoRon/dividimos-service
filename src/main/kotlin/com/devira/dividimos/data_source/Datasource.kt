package com.devira.dividimos.data_source

import com.devira.dividimos.model.Dish
import com.devira.dividimos.model.Guest
import com.devira.dividimos.model.Table

interface Datasource {
    fun getTable(tableId: String): Table?
    fun getGuests(): List<Guest>
    fun getGuestById(guestId: String): Guest?
    fun getDishes(): List<Dish>
    fun getDishesById(dishId: String): Dish?

}