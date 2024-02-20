package com.clean.mvvm.di;

import com.clean.mvvm.data.services.CatsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ServiceModule_ProvideCatsServiceFactory implements Factory<CatsService> {
  private final Provider<Retrofit> retrofitProvider;

  public ServiceModule_ProvideCatsServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CatsService get() {
    return provideCatsService(retrofitProvider.get());
  }

  public static ServiceModule_ProvideCatsServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new ServiceModule_ProvideCatsServiceFactory(retrofitProvider);
  }

  public static CatsService provideCatsService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideCatsService(retrofit));
  }
}
