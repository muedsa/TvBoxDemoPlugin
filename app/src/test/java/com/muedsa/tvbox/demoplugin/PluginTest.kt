package com.muedsa.tvbox.demoplugin

import org.junit.Test

class PluginTest {

    @Test
    fun create_test() {
        TestPlugin
    }

    @Test
    fun provideMainScreenService_test() {
        TestPlugin.provideMainScreenService()
    }

    @Test
    fun provideMediaDetailService_test() {
        TestPlugin.provideMediaDetailService()
    }

    @Test
    fun provideMediaSearchService_test() {
        TestPlugin.provideMediaSearchService()
    }
}