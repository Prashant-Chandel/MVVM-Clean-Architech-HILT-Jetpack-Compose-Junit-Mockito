package com.clean.mvvm.di

import com.clean.mvvm.data.repositories.CatDetailsRepositoryImpl
import com.clean.mvvm.data.repositories.CatsRepositoryImpl
import com.clean.mvvm.data.services.cats.CatApiServiceHelper
import com.clean.mvvm.data.services.cats.CatsDatabaseHelper
import com.clean.mvvm.data.services.catsDetail.CatDetailsApiServiceHelper
import com.clean.mvvm.data.services.catsDetail.CatsDetailsDatabaseHelper
import com.clean.mvvm.domain.repositories.CatDetailsRepository
import com.clean.mvvm.domain.repositories.CatsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object RepoModule {
    @Provides
    fun provideCatRepository(
        catsApiService: CatApiServiceHelper,
        catsDatabaseHelper: CatsDatabaseHelper
    ): CatsRepository {
        return CatsRepositoryImpl(catsApiService, catsDatabaseHelper)
    }

    @Provides
    fun provideCatDetailsRepository(
        catsApiService: CatDetailsApiServiceHelper,
        catsDatabaseHelper: CatsDetailsDatabaseHelper
    ): CatDetailsRepository {
        return CatDetailsRepositoryImpl(catsApiService, catsDatabaseHelper)
    }
}