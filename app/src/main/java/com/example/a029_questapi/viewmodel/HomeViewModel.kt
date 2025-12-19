package com.example.a029_questapi.viewmodel

import com.example.a029_questapi.modeldata.DataSiswa

sealed interface StatusUiSiswa {
    data class Success(val siswa: List<DataSiswa> = listOf()) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}

