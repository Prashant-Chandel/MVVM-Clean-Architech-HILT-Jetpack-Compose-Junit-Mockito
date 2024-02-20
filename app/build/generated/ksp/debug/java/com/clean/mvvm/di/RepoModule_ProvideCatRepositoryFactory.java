package com.clean.mvvm.di;

import com.clean.mvvm.data.services.cats.CatApiServiceHelper;
import com.clean.mvvm.data.services.cats.CatsDatabaseHelper;
import com.clean.mvvm.domain.repositories.CatsRepository;
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
public final class RepoModule_ProvideCatRepositoryFactory implements Factory<CatsRepository> {
  private final Provider<CatApiServiceHelper> catsApiServiceProvider;

  private final Provider<CatsDatabaseHelper> catsDatabaseHelperProvider;

  public RepoModule_ProvideCatRepositoryFactory(
      Provider<CatApiServiceHelper> catsApiServiceProvider,
      Provider<CatsDatabaseHelper> catsDatabaseHelperProvider) {
    this.catsApiServiceProvider = catsApiServiceProvider;
    this.catsDatabaseHelperProvider = catsDatabaseHelperProvider;
  }

  @Override
  public CatsRepository get() {
    return provideCatRepository(catsApiServiceProvider.get(), catsDatabaseHelperProvider.get());
  }

  public static RepoModule_ProvideCatRepositoryFactory create(
      Provider<CatApiServiceHelper> catsApiServiceProvider,
      Provider<CatsDatabaseHelper> catsDatabaseHelperProvider) {
    return new RepoModule_ProvideCatRepositoryFactory(catsApiServiceProvider, catsDatabaseHelperProvider);
  }

  public static CatsRepository provideCatRepository(CatApiServiceHelper catsApiService,
      CatsDatabaseHelper catsDatabaseHelper) {
    return Preconditions.checkNotNullFromProvides(RepoModule.INSTANCE.provideCatRepository(catsApiService, catsDatabaseHelper));
  }
}
