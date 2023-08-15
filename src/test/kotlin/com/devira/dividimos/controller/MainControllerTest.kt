package com.devira.dividimos.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class MainControllerTest {

    private val tableId = "123456789"
    private val guestId = "123456789"
    private val dishId = "123456789"

    private val invalidTableId = "1111111"
    private val invalidGuestId = "1111111"
    private val invalidDishId = "1111111"

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun shouldReturnATableObject() {
        //when/then

        mockMvc.get("/table") {
            param("tableId", tableId)
        }
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.id") { value("123456789") }
                jsonPath("$.total") { value("10.0") }
            }
    }

    @Test
    fun shouldReturnAGuest() {
        //when/then
        mockMvc.get("/guest") {
            param("guestId", guestId)
        }
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.id") { value("123456789") }
                jsonPath("$.name") { value("guest") }
            }
    }

    @Test
    fun shouldReturnADish() {
        mockMvc.get("/dish") {
            param("dishId", dishId)
        }
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.id") { value("123456789") }
                jsonPath("$.name") { value("dish") }
            }
    }

    @Test
    fun shouldReturnAListOfGuests() {
        mockMvc.get("/guests")
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$[0].id") { value("123456789") }
            }
    }

    @Test
    fun shouldReturnAListOfDishes() {
        mockMvc.get("/dishes")
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$[0].id") { value("123456789") }
            }
    }

    @Test
    fun shouldReturnNotFoundIfNullDish() {
        mockMvc.get("/dish"){
            param("dishId", invalidDishId)
        }
            .andDo { print() }
            .andExpect {
                status { isNotFound() }
            }
    }

    @Test
    fun shouldReturnNotFoundIfNullGuest() {
        mockMvc.get("/guest"){
            param("guestId", invalidGuestId)
        }
            .andDo { print() }
            .andExpect {
                status { isNotFound() }
            }
    }

}