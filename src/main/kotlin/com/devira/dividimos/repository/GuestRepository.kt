package com.devira.dividimos.repository

import com.devira.dividimos.database.GuestEntity
import org.springframework.data.repository.CrudRepository

interface GuestRepository: CrudRepository<GuestEntity, Long> {
    override fun findAll(): List<GuestEntity>
}