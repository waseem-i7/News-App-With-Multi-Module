package com.wizion.search_domain.repository

import com.wizion.search_domain.model.Article

interface SearchRepository {
    suspend fun getSearchArticles(map : MutableMap<String,String>) : List<Article>
}