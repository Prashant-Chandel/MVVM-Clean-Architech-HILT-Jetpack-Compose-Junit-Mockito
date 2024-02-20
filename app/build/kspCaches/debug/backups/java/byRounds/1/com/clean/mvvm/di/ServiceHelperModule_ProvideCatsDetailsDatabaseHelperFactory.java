package com.clean.mvvm.di;

import com.clean.mvvm.data.database.UserDatabase;
import com.clean.mvvm.data.services.catsDetail.CatsDetailsDatabaseHelper;
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
public final class ServiceHelperModule_ProvideCatsDetailsDatabaseHelperFactory implements Factory<CatsDetailsDatabaseHelper> {
  private final Provider<UserDatabase> databaseHelperProvider;

  public ServiceHelperModule_ProvideCatsDetailsDatabaseHelperFactory(
      Provider<UserDatabase> databaseHelperProvider) {
    this.databaseHelperProvider = databaseHelperProvider;
  }

  @Override
  public CatsDetailsDatabaseHelper get() {
    return provideCatsDetailsDatabaseHelper(databaseHelperProvider.get());
  }

  public static ServiceHelperModule_ProvideCatsDetailsDatabaseHelperFactory create(
      Provider<UserDatabase> databaseHelperProvider) {
    return new ServiceHelperModule_ProvideCatsDetailsDatabaseHelperFactory(databaseHelperProvider);
  }

  public static CatsDetailsDatabaseHelper provideCatsDetailsDatabaseHelper(
      UserDatabase databaseHelper) {
    return Preconditions.checkNotNullFromProvides(ServiceHelperModule.INSTANCE.provideCatsDetailsDatabaseHelper(databaseHelper));
  }
}
