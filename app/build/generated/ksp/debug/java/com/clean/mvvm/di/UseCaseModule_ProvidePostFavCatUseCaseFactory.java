package com.clean.mvvm.di;

import com.clean.mvvm.domain.repositories.CatDetailsRepository;
import com.clean.mvvm.domain.usecase.catsDetail.PostFavCatUseCase;
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
public final class UseCaseModule_ProvidePostFavCatUseCaseFactory implements Factory<PostFavCatUseCase> {
  private final Provider<CatDetailsRepository> catDetailsRepoProvider;

  public UseCaseModule_ProvidePostFavCatUseCaseFactory(
      Provider<CatDetailsRepository> catDetailsRepoProvider) {
    this.catDetailsRepoProvider = catDetailsRepoProvider;
  }

  @Override
  public PostFavCatUseCase get() {
    return providePostFavCatUseCase(catDetailsRepoProvider.get());
  }

  public static UseCaseModule_ProvidePostFavCatUseCaseFactory create(
      Provider<CatDetailsRepository> catDetailsRepoProvider) {
    return new UseCaseModule_ProvidePostFavCatUseCaseFactory(catDetailsRepoProvider);
  }

  public static PostFavCatUseCase providePostFavCatUseCase(CatDetailsRepository catDetailsRepo) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.providePostFavCatUseCase(catDetailsRepo));
  }
}
