package br.com.douglasmotta.whitelabeltutorial.domain.impl

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.data.repository.ProductRepository
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.UploadProductImageUseCase

class UploadProductImageUseCaseImpl (
    private val repository: ProductRepository
): UploadProductImageUseCase {

    override suspend fun invoke(imageUri: Uri): String {
       return repository.uploadProductImage(imageUri)
    }
}