package com.ranzan.cleanarchitechmvvm.di

import android.app.Application
import androidx.room.Room
import com.ranzan.cleanarchitechmvvm.feature_data.data.data_source.NoteDao
import com.ranzan.cleanarchitechmvvm.feature_data.data.data_source.NoteDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 * when want to define room database through koin we have to create a module of it.
 */
val userDatabase = module {
    fun provideDatabase(application: Application): NoteDatabase {
        return Room.databaseBuilder(application, NoteDatabase::class.java, "USER_DB")
//            .fallbackToDestructiveMigration()

            /**
             * here fall back to destructiveMigration() will remove everything which was in database
             * and start adding new data, using it the app will never crash as it cleans all data form
             * database and create new one.
             */
            .addMigrations(NoteDatabase.migration_1_2, NoteDatabase.migration_2_3) // can add as many migrations we want to but adding many will complicate the code.

//            .addMigrations(NoteDatabase.migration_1_2)
            .build()
    }

    fun provideDao(noteDatabase: NoteDatabase): NoteDao {
        return noteDatabase.noteDao
    }

    /**
     * used single to make the function return Single instance through out the application.
     */
    single { provideDatabase(androidApplication()) }
    single { provideDao(get()) }

}
