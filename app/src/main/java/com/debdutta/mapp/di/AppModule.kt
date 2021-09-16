package com.debdutta.mapp.di

import com.debdutta.mapp.data.remote.api.FetchApi
import com.debdutta.core.domain.FetchRepository
import com.debdutta.mapp.FetchRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFetchApi(): FetchApi {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FetchApi::class.java)
    }

    @Provides
    @Singleton
    fun provideFetchRepository(api: FetchApi): FetchRepository {
        return FetchRepositoryImpl(api)
    }
}