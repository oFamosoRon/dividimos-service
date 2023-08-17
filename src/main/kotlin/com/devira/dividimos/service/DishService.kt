package com.devira.dividimos.service

import com.devira.dividimos.data_source.LocalDatasourceOld
import com.devira.dividimos.model.Dish
import org.springframework.stereotype.Repository

@Repository
class DishService(private val datasource: LocalDatasourceOld) {

    fun getDishes(): List<Dish> =
        datasource.getDishes()

    fun getDishById(dishId: String): Dish =
        datasource.getDishesById(dishId = dishId)

}