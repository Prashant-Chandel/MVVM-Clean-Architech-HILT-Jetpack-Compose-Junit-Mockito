package com.clean.mvvm.di;

import com.clean.mvvm.data.database.UserDatabase;
import com.clean.mvvm.data.database.dao.FavouriteDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DatabaseModule_ProvideFavImageDaoFactory implements Factory<FavouriteDao> {
  private final Provider<UserDatabase> userDatabaseProvider;

  public DatabaseModule_ProvideFavImageDaoFactory(Provider<UserDatabase> userDatabaseProvider) {
    this.userDatabaseProvider = userDatabaseProvider;
  }

  @Override
  public FavouriteDao get() {
    return provideFavImageDao(userDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideFavImageDaoFactory create(
      Provider<UserDatabase> userDatabaseProvider) {
    return new DatabaseModule_ProvideFavImageDaoFactory(userDatabaseProvider);
  }

  public static FavouriteDao provideFavImageDao(UserDatabase userDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideFavImageDao(userDatabase));
  }
}
