package com.clean.mvvm.di

import android.content.Context
import com.clean.mvvm.data.database.UserDatabase
import com.clean.mvvm.data.database.dao.FavouriteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideUserDatabase(@ApplicationContext context: Context): UserDatabase {
        return UserDatabase.getInstance(context)
    }

    @Singleton
    @Provides
    fun provideFavImageDao(userDatabase: UserDatabase): FavouriteDao {
        return userDatabase.favImageDao()
    }
}
