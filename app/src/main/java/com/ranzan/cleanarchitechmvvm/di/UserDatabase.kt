package com.ranzan.cleanarchitechmvvm.di

import android.app.Application
import androidx.room.Room
import com.ranzan.cleanarchitechmvvm.feature_data.data.data_source.NoteDao
import com.ranzan.cleanarchitechmvvm.feature_data.data.data_source.NoteDatabase
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.NoteUseCases
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val userDatabase = module {
    fun provideDatabase(application: Application): NoteDatabase {
        return Room.databaseBuilder(application, NoteDatabase::class.java, "USER_DB")
            .fallbackToDestructiveMigration()
            .build()
    }

    fun provideDao(noteDatabase: NoteDatabase): NoteDao {
        return noteDatabase.noteDao
    }

    single { provideDatabase(androidApplication()) }
    single { provideDao(get()) }



}
