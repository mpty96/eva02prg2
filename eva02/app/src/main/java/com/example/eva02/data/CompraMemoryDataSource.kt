package com.example.eva02.data

import android.util.Log
import com.example.eva02.data.modelo.Compra

class CompraMemoryDataSource {
    private val _compras = mutableListOf<Compra>()

    init {
        _compras.addAll(comprasDePrueba())
    }

    fun obtenerTodas():List<Compra> {
        return _compras
    }

    fun insertar(vararg compras: Compra) {
        _compras.addAll( compras.asList() )
    }

    fun eliminar(compra: Compra) {
        _compras.remove(compra)
        Log.v("DataSource", _compras.toString())
    }

    private fun comprasDePrueba():List<Compra> = listOf(
        /*
        Compra(UUID.randomUUID().toString(), "2 Kg. de pan")
        , Compra(UUID.randomUUID().toString(), "Shampoo")
        , Compra(UUID.randomUUID().toString(), "Jabón liquido")
        , Compra(System.currentTimeMillis(), "3 Pimentones Rojos")
        , Compra(System.currentTimeMillis(), "1 Paquete de vienesas")
         */
    )
}