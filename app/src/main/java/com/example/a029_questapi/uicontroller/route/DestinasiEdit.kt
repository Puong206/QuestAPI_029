package com.example.a029_questapi.uicontroller.route

import com.example.a029_questapi.R

object DestinasiEdit: DestinasiNavigasi {
    override val route = "edit_siswa"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}