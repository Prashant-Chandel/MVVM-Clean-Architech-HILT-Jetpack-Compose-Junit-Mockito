package com.clean.mvvm.di;

import com.clean.mvvm.data.services.CatsService;
import com.clean.mvvm.data.services.catsDetail.CatDetailsApiServiceHelper;
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
public final class ServiceHelperModule_ProvideCatDetailsApiServiceHelperFactory implements Factory<CatDetailsApiServiceHelper> {
  private final Provider<CatsService> apiServiceProvider;

  public ServiceHelperModule_ProvideCatDetailsApiServiceHelperFactory(
      Provider<CatsService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public CatDetailsApiServiceHelper get() {
    return provideCatDetailsApiServiceHelper(apiServiceProvider.get());
  }

  public static ServiceHelperModule_ProvideCatDetailsApiServiceHelperFactory create(
      Provider<CatsService> apiServiceProvider) {
    return new ServiceHelperModule_ProvideCatDetailsApiServiceHelperFactory(apiServiceProvider);
  }

  public static CatDetailsApiServiceHelper provideCatDetailsApiServiceHelper(
      CatsService apiService) {
    return Preconditions.checkNotNullFromProvides(ServiceHelperModule.INSTANCE.provideCatDetailsApiServiceHelper(apiService));
  }
}
