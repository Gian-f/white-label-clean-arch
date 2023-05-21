package br.com.douglasmotta.whitelabeltutorial.domain.usecase.di

import br.com.douglasmotta.whitelabeltutorial.domain.impl.CreateProductUseCaseImpl
import br.com.douglasmotta.whitelabeltutorial.domain.impl.GetProductUseCaseImpl
import br.com.douglasmotta.whitelabeltutorial.domain.impl.UploadProductImageUseCaseImpl
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.CreateProductUseCase
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.GetProductUseCase
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.UploadProductImageUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface DomainModule {

    @Binds
    fun bindCreateProductUseCase(useCase: CreateProductUseCaseImpl): CreateProductUseCase

    @Binds
    fun bindGetProductSUseCase(useCase: GetProductUseCaseImpl): GetProductUseCase

    @Binds
    fun bindUploadImageUseCase(useCase: UploadProductImageUseCaseImpl): UploadProductImageUseCase
}