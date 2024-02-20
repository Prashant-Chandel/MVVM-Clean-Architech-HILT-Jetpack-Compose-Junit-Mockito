package com.clean.mvvm.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class ServiceModule_ProvideCustomRetrofitFactory implements Factory<Retrofit> {
  private final Provider<Context> contextProvider;

  public ServiceModule_ProvideCustomRetrofitFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Retrofit get() {
    return provideCustomRetrofit(contextProvider.get());
  }

  public static ServiceModule_ProvideCustomRetrofitFactory create(
      Provider<Context> contextProvider) {
    return new ServiceModule_ProvideCustomRetrofitFactory(contextProvider);
  }

  public static Retrofit provideCustomRetrofit(Context context) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideCustomRetrofit(context));
  }
}
