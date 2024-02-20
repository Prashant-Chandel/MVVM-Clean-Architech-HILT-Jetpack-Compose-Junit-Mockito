package com.clean.mvvm.di;

import com.clean.mvvm.data.services.CatsService;
import com.clean.mvvm.data.services.cats.CatApiServiceHelper;
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
public final class ServiceHelperModule_ProvideCatApiServiceHelperFactory implements Factory<CatApiServiceHelper> {
  private final Provider<CatsService> apiServiceProvider;

  public ServiceHelperModule_ProvideCatApiServiceHelperFactory(
      Provider<CatsService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public CatApiServiceHelper get() {
    return provideCatApiServiceHelper(apiServiceProvider.get());
  }

  public static ServiceHelperModule_ProvideCatApiServiceHelperFactory create(
      Provider<CatsService> apiServiceProvider) {
    return new ServiceHelperModule_ProvideCatApiServiceHelperFactory(apiServiceProvider);
  }

  public static CatApiServiceHelper provideCatApiServiceHelper(CatsService apiService) {
    return Preconditions.checkNotNullFromProvides(ServiceHelperModule.INSTANCE.provideCatApiServiceHelper(apiService));
  }
}
