package com.wizion.search_presentation

import com.wizion.search_domain.model.Article

data class SearchState(
    val isLoading : Boolean = false,
    val error: String = "",
    val data : List<Article>? = null
)
