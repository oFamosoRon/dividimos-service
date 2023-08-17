package com.devira.dividimos.data_source

import com.devira.dividimos.database.GuestEntity
import org.springframework.data.repository.CrudRepository

interface GuestDatasource: CrudRepository<GuestEntity, Long> {
    override fun findAll(): List<GuestEntity>
}