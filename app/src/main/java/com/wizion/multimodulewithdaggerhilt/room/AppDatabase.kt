package com.wizion.multimodulewithdaggerhilt.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.wizion.news_data.room.NewsDAO
import com.wizion.news_domain.model.Article

@Database(entities = [Article::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase(){
    companion object {
        fun getInstance(context : Context): AppDatabase{
            return Room.databaseBuilder(context,AppDatabase::class.java,"app_db")
                .fallbackToDestructiveMigration().build()
        }
    }

    abstract fun getNewsDao() : NewsDAO
}



















