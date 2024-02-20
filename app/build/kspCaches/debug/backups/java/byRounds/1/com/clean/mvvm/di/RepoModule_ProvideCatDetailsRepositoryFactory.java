package com.clean.mvvm.di;

import com.clean.mvvm.data.services.catsDetail.CatDetailsApiServiceHelper;
import com.clean.mvvm.data.services.catsDetail.CatsDetailsDatabaseHelper;
import com.clean.mvvm.domain.repositories.CatDetailsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RepoModule_ProvideCatDetailsRepositoryFactory implements Factory<CatDetailsRepository> {
  private final Provider<CatDetailsApiServiceHelper> catsApiServiceProvider;

  private final Provider<CatsDetailsDatabaseHelper> catsDatabaseHelperProvider;

  public RepoModule_ProvideCatDetailsRepositoryFactory(
      Provider<CatDetailsApiServiceHelper> catsApiServiceProvider,
      Provider<CatsDetailsDatabaseHelper> catsDatabaseHelperProvider) {
    this.catsApiServiceProvider = catsApiServiceProvider;
    this.catsDatabaseHelperProvider = catsDatabaseHelperProvider;
  }

  @Override
  public CatDetailsRepository get() {
    return provideCatDetailsRepository(catsApiServiceProvider.get(), catsDatabaseHelperProvider.get());
  }

  public static RepoModule_ProvideCatDetailsRepositoryFactory create(
      Provider<CatDetailsApiServiceHelper> catsApiServiceProvider,
      Provider<CatsDetailsDatabaseHelper> catsDatabaseHelperProvider) {
    return new RepoModule_ProvideCatDetailsRepositoryFactory(catsApiServiceProvider, catsDatabaseHelperProvider);
  }

  public static CatDetailsRepository provideCatDetailsRepository(
      CatDetailsApiServiceHelper catsApiService, CatsDetailsDatabaseHelper catsDatabaseHelper) {
    return Preconditions.checkNotNullFromProvides(RepoModule.INSTANCE.provideCatDetailsRepository(catsApiService, catsDatabaseHelper));
  }
}
