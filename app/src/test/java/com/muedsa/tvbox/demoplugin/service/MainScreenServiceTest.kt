package com.muedsa.tvbox.demoplugin.service

import com.muedsa.tvbox.demoplugin.TestPlugin
import kotlinx.coroutines.test.runTest
import org.junit.Test

class MainScreenServiceTest {

    private val service = TestPlugin.provideMainScreenService()

    @Test
    fun getRowsDataTest() = runTest{
        val rows = service.getRowsData()
        rows.forEach { row ->
            check(row.title.isNotEmpty())
            check(row.list.isNotEmpty())
            check(row.cardWidth > 0)
            check(row.cardHeight > 0)
            println("${row.title} ${row.cardWidth}X${row.cardHeight} ${row.cardType}")
            row.list.forEach {
                println("${it.title} ${it.id} ${it.detailUrl}")
            }
        }
    }

}