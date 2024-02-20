package com.clean.mvvm.presentation.ui.features.catDetails.viewModel;

import com.clean.mvvm.domain.usecase.catsDetail.CheckFavUseCase;
import com.clean.mvvm.domain.usecase.catsDetail.DeleteFavCatUseCase;
import com.clean.mvvm.domain.usecase.catsDetail.PostFavCatUseCase;
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
public final class CatsDetailsViewModel_Factory implements Factory<CatsDetailsViewModel> {
  private final Provider<PostFavCatUseCase> postFavCatUseCaseProvider;

  private final Provider<DeleteFavCatUseCase> deleteFavCatUseCaseProvider;

  private final Provider<CheckFavUseCase> checkFavouriteUseCaseProvider;

  public CatsDetailsViewModel_Factory(Provider<PostFavCatUseCase> postFavCatUseCaseProvider,
      Provider<DeleteFavCatUseCase> deleteFavCatUseCaseProvider,
      Provider<CheckFavUseCase> checkFavouriteUseCaseProvider) {
    this.postFavCatUseCaseProvider = postFavCatUseCaseProvider;
    this.deleteFavCatUseCaseProvider = deleteFavCatUseCaseProvider;
    this.checkFavouriteUseCaseProvider = checkFavouriteUseCaseProvider;
  }

  @Override
  public CatsDetailsViewModel get() {
    return newInstance(postFavCatUseCaseProvider.get(), deleteFavCatUseCaseProvider.get(), checkFavouriteUseCaseProvider.get());
  }

  public static CatsDetailsViewModel_Factory create(
      Provider<PostFavCatUseCase> postFavCatUseCaseProvider,
      Provider<DeleteFavCatUseCase> deleteFavCatUseCaseProvider,
      Provider<CheckFavUseCase> checkFavouriteUseCaseProvider) {
    return new CatsDetailsViewModel_Factory(postFavCatUseCaseProvider, deleteFavCatUseCaseProvider, checkFavouriteUseCaseProvider);
  }

  public static CatsDetailsViewModel newInstance(PostFavCatUseCase postFavCatUseCase,
      DeleteFavCatUseCase deleteFavCatUseCase, CheckFavUseCase checkFavouriteUseCase) {
    return new CatsDetailsViewModel(postFavCatUseCase, deleteFavCatUseCase, checkFavouriteUseCase);
  }
}
