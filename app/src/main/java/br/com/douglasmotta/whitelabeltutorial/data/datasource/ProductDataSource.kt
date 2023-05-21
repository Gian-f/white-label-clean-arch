package br.com.douglasmotta.whitelabeltutorial.data.datasource

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product

interface ProductDataSource {

    suspend fun getProducts(): List<Product>

    suspend fun uploadProductImage(imageUri: Uri): String

    suspend fun createProduct(product: Product): Product

}