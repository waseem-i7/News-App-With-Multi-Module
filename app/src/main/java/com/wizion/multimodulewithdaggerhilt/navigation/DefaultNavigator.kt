package com.wizion.multimodulewithdaggerhilt.navigation

import android.app.Activity
import com.wizion.common_utils.Activities
import com.wizion.common_utils.Navigator
import com.wizion.news_presentation.GoToNewsActivity
import com.wizion.search_presentation.GoToSearchActivity

class DefaultNavigator : Navigator.Provider {
    override fun getActivities(activities: Activities): Navigator {
        return when(activities){
            Activities.NewsActivity ->{GoToNewsActivity}
            Activities.SearchActivity->{GoToSearchActivity}
        }
    }

}
