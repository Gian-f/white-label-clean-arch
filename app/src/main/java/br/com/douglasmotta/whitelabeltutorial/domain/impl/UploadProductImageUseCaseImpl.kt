package br.com.douglasmotta.whitelabeltutorial.domain.impl

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.data.repository.ProductRepository
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.UploadProductImageUseCase
import javax.inject.Inject

class UploadProductImageUseCaseImpl @Inject constructor(
    private val repository: ProductRepository
): UploadProductImageUseCase {

    override suspend fun invoke(imageUri: Uri): String {
       return repository.uploadProductImage(imageUri)
    }
}