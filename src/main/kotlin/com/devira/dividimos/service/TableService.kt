package com.devira.dividimos.service

import com.devira.dividimos.data_source.LocalDatasource
import com.devira.dividimos.model.Table
import org.springframework.stereotype.Repository

@Repository
class TableService(private val datasource: LocalDatasource) {

    fun getTable(tableId: String): Table? =
        datasource.getTable(tableId = tableId)

}