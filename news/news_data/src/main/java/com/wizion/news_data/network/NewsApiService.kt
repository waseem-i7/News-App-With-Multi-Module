package com.wizion.news_data.network

import com.wizion.common_utils.Constants
import com.wizion.news_data.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

   // https://newsapi.org/v2/everything?q=tesla&from=2023-03-08&sortBy=publishedAt&apiKey=10197b5a158c4559acf9535038472bd3
   // https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY


    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country : String = Constants.COUNTRY,
        @Query("apiKey") apiKey : String = Constants.API_KEY) : NewsResponse
}