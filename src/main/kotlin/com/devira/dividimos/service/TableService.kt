package com.devira.dividimos.service

import com.devira.dividimos.data_source.Datasource
import com.devira.dividimos.model.Table
import org.springframework.stereotype.Repository

@Repository
class TableService(private val datasource: Datasource) {

    fun getTable(tableId: String): Table? =
        datasource.getTable(tableId = tableId)

}