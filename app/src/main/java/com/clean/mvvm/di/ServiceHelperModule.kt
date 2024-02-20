package com.clean.mvvm.di

import com.clean.mvvm.data.database.UserDatabase
import com.clean.mvvm.data.services.CatsService
import com.clean.mvvm.data.services.cats.CatApiServiceHelper
import com.clean.mvvm.data.services.cats.CatApiServiceHelperImpl
import com.clean.mvvm.data.services.cats.CatsDatabaseHelper
import com.clean.mvvm.data.services.cats.CatsDatabaseHelperImpl
import com.clean.mvvm.data.services.catsDetail.CatDetailsApiServiceHelper
import com.clean.mvvm.data.services.catsDetail.CatDetailsApiServiceHelperImpl
import com.clean.mvvm.data.services.catsDetail.CatsDetailsDatabaseHelper
import com.clean.mvvm.data.services.catsDetail.CatsDetailsDatabaseHelperImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ServiceHelperModule {

    @Provides
    fun provideCatApiServiceHelper(apiService: CatsService): CatApiServiceHelper {
        return CatApiServiceHelperImpl(apiService)
    }

    @Provides
    fun provideCatsDatabaseHelper(databaseHelper: UserDatabase): CatsDatabaseHelper {
        return CatsDatabaseHelperImpl(databaseHelper)
    }

    @Provides
    fun provideCatDetailsApiServiceHelper(apiService: CatsService): CatDetailsApiServiceHelper {
        return CatDetailsApiServiceHelperImpl(apiService)
    }

    @Provides
    fun provideCatsDetailsDatabaseHelper(databaseHelper: UserDatabase): CatsDetailsDatabaseHelper {
        return CatsDetailsDatabaseHelperImpl(databaseHelper)
    }
}