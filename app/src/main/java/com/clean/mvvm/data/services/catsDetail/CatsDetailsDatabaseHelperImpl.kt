package com.clean.mvvm.data.services.catsDetail

import com.clean.mvvm.data.database.UserDatabase
import com.clean.mvvm.data.database.entities.FavImageEntity

class CatsDetailsDatabaseHelperImpl(private val db: UserDatabase) : CatsDetailsDatabaseHelper {
    override suspend fun insertFavCatImageRelation(favCatId: Int, imageId: String): Long {
        return FavImageEntity(favCatId, imageId).let {
            db.favImageDao().insertFavCatImageRelation(it)
        }
    }

    override suspend fun deleteFavImage(catImageId: String): Int {
        return db.favImageDao().deleteFavImage(catImageId)
    }

    override suspend fun isFavourite(catImageId: String): Int? {
        return db.favImageDao().getFavId(catImageId)
    }
}