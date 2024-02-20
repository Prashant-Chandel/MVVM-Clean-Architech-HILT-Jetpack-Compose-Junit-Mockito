/*
package com.clean.mvvm.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.viewmodel.compose.viewModel
import com.clean.mvvm.data.database.UserDatabase
import com.clean.mvvm.data.repositories.CatDetailsRepositoryImpl
import com.clean.mvvm.data.repositories.CatsRepositoryImpl
import com.clean.mvvm.data.services.cats.CatApiServiceHelper
import com.clean.mvvm.data.services.cats.CatApiServiceHelperImpl
import com.clean.mvvm.data.services.cats.CatsDatabaseHelper
import com.clean.mvvm.data.services.cats.CatsDatabaseHelperImpl
import com.clean.mvvm.data.services.catsDetail.CatDetailsApiServiceHelper
import com.clean.mvvm.data.services.catsDetail.CatDetailsApiServiceHelperImpl
import com.clean.mvvm.data.services.catsDetail.CatsDetailsDatabaseHelper
import com.clean.mvvm.data.services.catsDetail.CatsDetailsDatabaseHelperImpl
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
import com.clean.mvvm.presentation.ui.features.catDetails.viewModel.CatsDetailsViewModel
import com.clean.mvvm.presentation.ui.features.cats.viewModel.CatsViewModel
import com.clean.mvvm.utils.Constants
import com.google.gson.GsonBuilder
import com.pddstudio.preferences.encrypted.EncryptedPreferences
import kotlinx.coroutines.Dispatchers
import net.bytebuddy.matcher.ElementMatchers.named
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

private val gsonModule = module {
    single { GsonBuilder().create() }
}

private fun getSharedPreferences(androidApplication: Application): SharedPreferences =
    androidApplication.getSharedPreferences(
        Constants.SHARED_PREFERENCES, Context.MODE_PRIVATE
    )

private val persistence = module {
    single<EncryptedPreferences> {
        EncryptedPreferences.Builder(get()).withEncryptionPassword(Constants.PREF_PASSWORD).build()
    }
    single {
        getSharedPreferences(androidApplication())
    }
    single<SharedPreferences.Editor> {
        getSharedPreferences(androidApplication()).edit()
    }
}
private val viewModelModule = module {
    viewModel { CatsViewModel(get(), get()) }
    viewModel { CatsDetailsViewModel(get(), get(), get()) }

}




private val dispatchModule = module {
    single(named("io")) { Dispatchers.IO }
    single(named("main")) { Dispatchers.Main }
    single(named("default")) { Dispatchers.Default }
}





//Add module to allModules for use
val allModules = listOf(
    viewModelModule,
    persistence,
    dispatchModule,
    gsonModule
)*/
