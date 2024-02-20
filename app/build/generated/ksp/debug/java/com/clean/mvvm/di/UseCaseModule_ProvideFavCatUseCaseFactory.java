package com.clean.mvvm.di;

import com.clean.mvvm.domain.repositories.CatsRepository;
import com.clean.mvvm.domain.usecase.cats.GetFavCatsUseCase;
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
public final class UseCaseModule_ProvideFavCatUseCaseFactory implements Factory<GetFavCatsUseCase> {
  private final Provider<CatsRepository> catRepoProvider;

  public UseCaseModule_ProvideFavCatUseCaseFactory(Provider<CatsRepository> catRepoProvider) {
    this.catRepoProvider = catRepoProvider;
  }

  @Override
  public GetFavCatsUseCase get() {
    return provideFavCatUseCase(catRepoProvider.get());
  }

  public static UseCaseModule_ProvideFavCatUseCaseFactory create(
      Provider<CatsRepository> catRepoProvider) {
    return new UseCaseModule_ProvideFavCatUseCaseFactory(catRepoProvider);
  }

  public static GetFavCatsUseCase provideFavCatUseCase(CatsRepository catRepo) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideFavCatUseCase(catRepo));
  }
}
