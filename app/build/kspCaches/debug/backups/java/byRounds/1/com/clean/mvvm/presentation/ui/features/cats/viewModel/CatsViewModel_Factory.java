package com.clean.mvvm.presentation.ui.features.cats.viewModel;

import com.clean.mvvm.domain.usecase.cats.GetCatsUseCase;
import com.clean.mvvm.domain.usecase.cats.GetFavCatsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class CatsViewModel_Factory implements Factory<CatsViewModel> {
  private final Provider<GetCatsUseCase> catUseCaseProvider;

  private final Provider<GetFavCatsUseCase> getFavCatsUseCaseProvider;

  public CatsViewModel_Factory(Provider<GetCatsUseCase> catUseCaseProvider,
      Provider<GetFavCatsUseCase> getFavCatsUseCaseProvider) {
    this.catUseCaseProvider = catUseCaseProvider;
    this.getFavCatsUseCaseProvider = getFavCatsUseCaseProvider;
  }

  @Override
  public CatsViewModel get() {
    return newInstance(catUseCaseProvider.get(), getFavCatsUseCaseProvider.get());
  }

  public static CatsViewModel_Factory create(Provider<GetCatsUseCase> catUseCaseProvider,
      Provider<GetFavCatsUseCase> getFavCatsUseCaseProvider) {
    return new CatsViewModel_Factory(catUseCaseProvider, getFavCatsUseCaseProvider);
  }

  public static CatsViewModel newInstance(GetCatsUseCase catUseCase,
      GetFavCatsUseCase getFavCatsUseCase) {
    return new CatsViewModel(catUseCase, getFavCatsUseCase);
  }
}
