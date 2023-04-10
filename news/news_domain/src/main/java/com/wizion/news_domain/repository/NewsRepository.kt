package com.wizion.news_domain.repository

import com.wizion.news_domain.model.Article

interface NewsRepository {
    suspend fun getNewsActicle() : List<Article>
}