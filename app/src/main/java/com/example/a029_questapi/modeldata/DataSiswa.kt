package com.example.a029_questapi.modeldata

import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa(
    val id : Int,
    val nama : String,
    val alamat : String,
    val telpon : String
)

data class DetailSiswa(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val telpon: String = ""
)