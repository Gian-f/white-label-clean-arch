package br.com.douglasmotta.whitelabeltutorial.domain.impl

import br.com.douglasmotta.whitelabeltutorial.data.repository.ProductRepository
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.GetProductUseCase
import javax.inject.Inject

class GetProductUseCaseImpl @Inject constructor (
    private val repository: ProductRepository
): GetProductUseCase {

    override suspend fun invoke(): List<Product> {
        return repository.getProducts()
    }
}