package com.clean.mvvm.di

import com.clean.mvvm.domain.repositories.CatDetailsRepository
import com.clean.mvvm.domain.repositories.CatsRepository
import com.clean.mvvm.domain.usecase.cats.GetCatsUseCase
import com.clean.mvvm.domain.usecase.cats.GetCatsUseCaseImpl
import com.clean.mvvm.domain.usecase.cats.GetFavCatsUseCase
import com.clean.mvvm.domain.usecase.cats.GetFavCatsUseCaseImpl
import com.clean.mvvm.domain.usecase.catsDetail.CheckFavUseCase
import com.clean.mvvm.domain.usecase.catsDetail.CheckFavouriteUseCaseImpl
import com.clean.mvvm.domain.usecase.catsDetail.DeleteFavCatUseCase
import com.clean.mvvm.domain.usecase.catsDetail.DeleteFavCatUseCaseImpl
import com.clean.mvvm.domain.usecase.catsDetail.PostFavCatUseCase
import com.clean.mvvm.domain.usecase.catsDetail.PostFavCatUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @Provides
    fun provideCatUseCase(catsRepo: CatsRepository): GetCatsUseCase {
        return GetCatsUseCaseImpl(catsRepo)
    }

    @Provides
    fun provideFavCatUseCase(catRepo: CatsRepository): GetFavCatsUseCase {
        return GetFavCatsUseCaseImpl(catRepo)
    }

    @Provides
    fun providePostFavCatUseCase(catDetailsRepo: CatDetailsRepository): PostFavCatUseCase {
        return PostFavCatUseCaseImpl(catDetailsRepo)
    }

    @Provides
    fun provideCheckFavCatUseCase(catDetailsRepo: CatDetailsRepository): CheckFavUseCase {
        return CheckFavouriteUseCaseImpl(catDetailsRepo)
    }

    @Provides
    fun provideDeleteFavCatUseCase(catDetailsRepo: CatDetailsRepository): DeleteFavCatUseCase {
        return DeleteFavCatUseCaseImpl(catDetailsRepo)
    }

}