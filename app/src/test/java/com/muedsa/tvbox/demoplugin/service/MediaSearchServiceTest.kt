package com.muedsa.tvbox.demoplugin.service

import com.muedsa.tvbox.demoplugin.TestPlugin
import kotlinx.coroutines.test.runTest
import org.junit.Test

class MediaSearchServiceTest {

    private val service = TestPlugin.provideMediaSearchService()

    @Test
    fun searchMedias_test() = runTest {
        val row = service.searchMedias("GIRLS BAND CRY")
        check(row.list.isNotEmpty())
        check(row.cardWidth > 0)
        check(row.cardHeight > 0)
        row.list.forEach {
            check(it.id.isNotEmpty())
            check(it.title.isNotEmpty())
            check(it.detailUrl.isNotEmpty())
        }
    }
}