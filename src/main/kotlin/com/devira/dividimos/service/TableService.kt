package com.devira.dividimos.service

import com.devira.dividimos.data_source.LocalDatasourceOld
import com.devira.dividimos.model.Table
import org.springframework.stereotype.Repository

@Repository
class TableService(private val datasource: LocalDatasourceOld) {

    fun getTable(tableId: String): Table? =
        datasource.getTable(tableId = tableId)

}