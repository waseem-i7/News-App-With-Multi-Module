package com.wizion.news_data.mapper

import com.wizion.news_data.model.ArticleDTO
import com.wizion.news_domain.model.Article

fun ArticleDTO.toDomainArticle() : Article{
    return  Article(
        author = this.author?:"",
        content= this.content?:"",
        description = this.description?:"",
        title = this.title?:"",
        urlToImage = this.urlToImage?:""
    )
}