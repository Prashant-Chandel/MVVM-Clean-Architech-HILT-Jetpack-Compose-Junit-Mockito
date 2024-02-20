package com.clean.mvvm.di;

import com.clean.mvvm.domain.repositories.CatsRepository;
import com.clean.mvvm.domain.usecase.cats.GetCatsUseCase;
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
public final class UseCaseModule_ProvideCatUseCaseFactory implements Factory<GetCatsUseCase> {
  private final Provider<CatsRepository> catsRepoProvider;

  public UseCaseModule_ProvideCatUseCaseFactory(Provider<CatsRepository> catsRepoProvider) {
    this.catsRepoProvider = catsRepoProvider;
  }

  @Override
  public GetCatsUseCase get() {
    return provideCatUseCase(catsRepoProvider.get());
  }

  public static UseCaseModule_ProvideCatUseCaseFactory create(
      Provider<CatsRepository> catsRepoProvider) {
    return new UseCaseModule_ProvideCatUseCaseFactory(catsRepoProvider);
  }

  public static GetCatsUseCase provideCatUseCase(CatsRepository catsRepo) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideCatUseCase(catsRepo));
  }
}
