package com.wizion.search_domain.di

import com.wizion.search_domain.repository.SearchRepository
import com.wizion.search_domain.use_cases.GetSearchArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object SearchDomainModule {

    @Provides
    fun provideSearchUseCase(searchRepository: SearchRepository) : GetSearchArticleUseCase{
        return GetSearchArticleUseCase(searchRepository)
    }
}