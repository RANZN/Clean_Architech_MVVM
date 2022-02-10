package com.ranzan.cleanarchitechmvvm.di

import android.app.Application
import androidx.room.Room
import com.ranzan.cleanarchitechmvvm.feature_data.data.data_source.NoteDao
import com.ranzan.cleanarchitechmvvm.feature_data.data.data_source.NoteDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val userDatabase = module {
    fun provideDatabase(application: Application): NoteDatabase {
        return Room.databaseBuilder(application, NoteDatabase::class.java, "USER_DB")
//            .fallbackToDestructiveMigration()
//            .addMigrations(NoteDatabase.migration_1_2, NoteDatabase.migration_2_3)
            .addMigrations(NoteDatabase.migration_1_2)
            .build()
    }

    fun provideDao(noteDatabase: NoteDatabase): NoteDao {
        return noteDatabase.noteDao
    }

    single { provideDatabase(androidApplication()) }
    single { provideDao(get()) }

}
