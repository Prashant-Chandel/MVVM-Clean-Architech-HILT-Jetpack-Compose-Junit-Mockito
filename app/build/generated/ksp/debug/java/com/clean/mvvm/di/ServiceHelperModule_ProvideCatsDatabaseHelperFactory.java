package com.clean.mvvm.di;

import com.clean.mvvm.data.database.UserDatabase;
import com.clean.mvvm.data.services.cats.CatsDatabaseHelper;
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
public final class ServiceHelperModule_ProvideCatsDatabaseHelperFactory implements Factory<CatsDatabaseHelper> {
  private final Provider<UserDatabase> databaseHelperProvider;

  public ServiceHelperModule_ProvideCatsDatabaseHelperFactory(
      Provider<UserDatabase> databaseHelperProvider) {
    this.databaseHelperProvider = databaseHelperProvider;
  }

  @Override
  public CatsDatabaseHelper get() {
    return provideCatsDatabaseHelper(databaseHelperProvider.get());
  }

  public static ServiceHelperModule_ProvideCatsDatabaseHelperFactory create(
      Provider<UserDatabase> databaseHelperProvider) {
    return new ServiceHelperModule_ProvideCatsDatabaseHelperFactory(databaseHelperProvider);
  }

  public static CatsDatabaseHelper provideCatsDatabaseHelper(UserDatabase databaseHelper) {
    return Preconditions.checkNotNullFromProvides(ServiceHelperModule.INSTANCE.provideCatsDatabaseHelper(databaseHelper));
  }
}
