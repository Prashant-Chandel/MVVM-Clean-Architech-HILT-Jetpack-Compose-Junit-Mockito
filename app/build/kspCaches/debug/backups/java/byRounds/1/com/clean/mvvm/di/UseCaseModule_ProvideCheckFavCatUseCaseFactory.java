package com.clean.mvvm.di;

import com.clean.mvvm.domain.repositories.CatDetailsRepository;
import com.clean.mvvm.domain.usecase.catsDetail.CheckFavUseCase;
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
public final class UseCaseModule_ProvideCheckFavCatUseCaseFactory implements Factory<CheckFavUseCase> {
  private final Provider<CatDetailsRepository> catDetailsRepoProvider;

  public UseCaseModule_ProvideCheckFavCatUseCaseFactory(
      Provider<CatDetailsRepository> catDetailsRepoProvider) {
    this.catDetailsRepoProvider = catDetailsRepoProvider;
  }

  @Override
  public CheckFavUseCase get() {
    return provideCheckFavCatUseCase(catDetailsRepoProvider.get());
  }

  public static UseCaseModule_ProvideCheckFavCatUseCaseFactory create(
      Provider<CatDetailsRepository> catDetailsRepoProvider) {
    return new UseCaseModule_ProvideCheckFavCatUseCaseFactory(catDetailsRepoProvider);
  }

  public static CheckFavUseCase provideCheckFavCatUseCase(CatDetailsRepository catDetailsRepo) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideCheckFavCatUseCase(catDetailsRepo));
  }
}
