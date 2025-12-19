package com.example.a029_questapi.repositori

import okhttp3.logging.HttpLoggingInterceptor

interface ContainerApp {
    val repositoryDataSiswa : RepositoryDataSiswa
}

class DefaultContainerApp : ContainerApp {
    private val baseurl = ""

    val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
}