package com.devira.dividimos.service

import com.devira.dividimos.data_source.LocalDatasourceOld
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class TableServiceTest {

    private val datasource: LocalDatasourceOld = mockk(relaxed = true)
    private val tableService = TableService(datasource = datasource)

    @Test
    fun shouldCallLocalDatasourceToRetrieveTable() {
        //arrange
//        No need to arrange return since it used the relaxed property
//        every { datasource.getTable("") } returns null
//        every { datasource.getTable("123456789") } returns Table(
//            id = "123456789",
//            total = 10.0,
//            serviceFee = 1.0,
//            couvertFee = 1.0,
//            guests = emptyList(),
//            dishes = emptyList()
//        )

        //act
        tableService.getTable(tableId = "123456789")

        //assert
        verify(exactly = 1) { datasource.getTable("123456789") }
    }
}