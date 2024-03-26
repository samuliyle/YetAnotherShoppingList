package com.samyle.yetanothershoppinglist.di

import android.content.Context
import com.samyle.yetanothershoppinglist.data.AppDatabase
import com.samyle.yetanothershoppinglist.data.ShoppingListDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    fun provideShoppingListDao(appDatabase: AppDatabase): ShoppingListDao {
        return appDatabase.shoppingListDao()
    }
}