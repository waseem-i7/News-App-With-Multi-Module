package com.wizion.search_data.repository

import com.wizion.search_data.mapper.toDomainArticle
import com.wizion.search_data.network.SearchApi
import com.wizion.search_domain.model.Article
import com.wizion.search_domain.repository.SearchRepository

class SearchRepositoryImpl(private val searchApi: SearchApi) : SearchRepository {
    override suspend fun getSearchArticles(map: MutableMap<String, String>): List<Article> {
        return searchApi.getSearchArticles(map).articles.map {it.toDomainArticle()}
    }
}