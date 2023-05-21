package br.com.douglasmotta.whitelabeltutorial.data.di

import br.com.douglasmotta.whitelabeltutorial.data.datasource.FirebaseProductDataSource
import br.com.douglasmotta.whitelabeltutorial.data.datasource.ProductDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Singleton
    @Binds
    fun bindProductDataSource(dataSourceModule: FirebaseProductDataSource): ProductDataSource

}