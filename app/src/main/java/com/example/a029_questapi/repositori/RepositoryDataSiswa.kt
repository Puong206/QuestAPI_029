package com.example.a029_questapi.repositori

import com.example.a029_questapi.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
}