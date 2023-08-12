package com.devira.dividimos.data_source

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LocalDatasourceTest {

    private val localDatasource: LocalDatasource = LocalDatasourceImpl()

    @Test
    fun shouldProvideATableObject() {
        //act
        val nullTable = localDatasource.getTable(tableId = "")
        val table = localDatasource.getTable(tableId = "123456789")

        //assert
        Assertions.assertThat(nullTable).isNull()
        Assertions.assertThat(table).isNotNull
    }
}