package com.example.eva02.ui.ui.state

import com.example.eva02.data.modelo.Compra

data class ComprasUIState (
    val mensaje:String = "",
    val compras:List<Compra> = listOf<Compra>())