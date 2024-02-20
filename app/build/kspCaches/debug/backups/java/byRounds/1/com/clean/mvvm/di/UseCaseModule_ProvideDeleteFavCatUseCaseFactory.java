package com.clean.mvvm.di;

import com.clean.mvvm.domain.repositories.CatDetailsRepository;
import com.clean.mvvm.domain.usecase.catsDetail.DeleteFavCatUseCase;
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
public final class UseCaseModule_ProvideDeleteFavCatUseCaseFactory implements Factory<DeleteFavCatUseCase> {
  private final Provider<CatDetailsRepository> catDetailsRepoProvider;

  public UseCaseModule_ProvideDeleteFavCatUseCaseFactory(
      Provider<CatDetailsRepository> catDetailsRepoProvider) {
    this.catDetailsRepoProvider = catDetailsRepoProvider;
  }

  @Override
  public DeleteFavCatUseCase get() {
    return provideDeleteFavCatUseCase(catDetailsRepoProvider.get());
  }

  public static UseCaseModule_ProvideDeleteFavCatUseCaseFactory create(
      Provider<CatDetailsRepository> catDetailsRepoProvider) {
    return new UseCaseModule_ProvideDeleteFavCatUseCaseFactory(catDetailsRepoProvider);
  }

  public static DeleteFavCatUseCase provideDeleteFavCatUseCase(
      CatDetailsRepository catDetailsRepo) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideDeleteFavCatUseCase(catDetailsRepo));
  }
}
