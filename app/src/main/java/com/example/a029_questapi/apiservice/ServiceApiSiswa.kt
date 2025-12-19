package com.example.a029_questapi.apiservice

import com.example.a029_questapi.modeldata.DataSiswa
import retrofit2.http.GET

interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>
    

}