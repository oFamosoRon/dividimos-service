package com.devira.dividimos.service

import com.devira.dividimos.data_source.LocalDatasourceOld
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class DishServiceTest {

    private val datasource: LocalDatasourceOld = mockk(relaxed = true)
    private val dishService: DishService = DishService(datasource = datasource)

    @Test
    fun shouldCallDatasourceToRetrieveListOfDishes() {
        //act
        dishService.getDishes()

        verify(exactly = 1) { datasource.getDishes() }
    }

    @Test
    fun shouldCallDatasourceToRetrieveASingleDish() {
        //act
        dishService.getDishById(dishId = "123456789")

        verify(exactly = 1) { dishService.getDishById(dishId = "123456789") }
    }
}