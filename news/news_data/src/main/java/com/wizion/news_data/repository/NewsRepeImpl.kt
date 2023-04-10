package com.wizion.news_data.repository

import com.wizion.news_data.mapper.toDomainArticle
import com.wizion.news_data.network.NewsApiService
import com.wizion.news_data.room.NewsDAO
import com.wizion.news_domain.model.Article
import com.wizion.news_domain.repository.NewsRepository

class NewsRepoImpl(private val newsApiService: NewsApiService,private val newsDAO: NewsDAO) : NewsRepository {
    override suspend fun getNewsActicle(): List<Article> {
        return try {
            val temp = newsApiService.getNewsArticles().articles.map { it.toDomainArticle() }
            newsDAO.insertList(temp)
            newsDAO.getNewsArticle()
        }catch (e : Exception){
            newsDAO.getNewsArticle()
        }

    }
}

