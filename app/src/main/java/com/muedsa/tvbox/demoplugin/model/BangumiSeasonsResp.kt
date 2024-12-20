package com.muedsa.tvbox.demoplugin.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BangumiSeasonsResp(
    @SerialName("seasons") val seasons: List<BangumiSeason>,
    @SerialName("success") val success: Boolean = false,
    @SerialName("errorCode") val errorCode: Int = -1,
    @SerialName("errorMessage") val errorMessage: String = "",
)