package com.devira.dividimos.controller

import com.devira.dividimos.model.Dish
import com.devira.dividimos.model.Guest
import com.devira.dividimos.model.Table
import com.devira.dividimos.service.DishService
import com.devira.dividimos.service.GuestService
import com.devira.dividimos.service.TableService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(
    private val tableService: TableService,
    private val guestService: GuestService,
    private val dishService: DishService,
) {

    @GetMapping("/table")
    fun getTable(@RequestParam tableId: String): Table? =
        tableService.getTable(tableId = tableId)

    @GetMapping("/guest")
    fun getGuest(@RequestParam guestId: String): Guest? =
        guestService.getGuestById(guestId = guestId)

    @GetMapping("/dish")
    fun getDish(@RequestParam dishId: String): Dish? =
        dishService.getDishById(dishId = dishId)

    @GetMapping("/guests")
    fun getGuests(): List<Guest> =
        guestService.getGuests()

    @GetMapping("/dishes")
    fun getDishes(): List<Dish> =
        dishService.getDishes()
}