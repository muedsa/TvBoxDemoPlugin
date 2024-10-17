package com.muedsa.tvbox.demoplugin

import com.muedsa.tvbox.api.plugin.TvBoxContext

val TestPlugin by lazy { DemoPlugin(TvBoxContext(1080, 1920, true)) }