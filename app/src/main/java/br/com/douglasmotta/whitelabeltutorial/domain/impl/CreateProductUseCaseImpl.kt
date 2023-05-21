package br.com.douglasmotta.whitelabeltutorial.domain.impl

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.data.repository.ProductRepository
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.CreateProductUseCase
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.UploadProductImageUseCase
import java.util.UUID

class CreateProductUseCaseImpl(
    private val uploadProductImageUseCase: UploadProductImageUseCase,
    private val repository: ProductRepository
):CreateProductUseCase {

    override suspend fun invoke(description: String, price: Double, imageUri: Uri): Product {
        return try {
            val imageUrl = uploadProductImageUseCase(imageUri)
            val product = Product(UUID.randomUUID().toString(), description, price, imageUrl)
            repository.createProduct(product)
        } catch (e: Exception) {
            throw e
        }
    }
}