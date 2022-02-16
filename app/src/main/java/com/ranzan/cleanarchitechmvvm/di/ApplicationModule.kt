package com.ranzan.cleanarchitechmvvm.di

import com.ranzan.cleanarchitechmvvm.feature_data.data.repository.NoteRepositoryImpl
import com.ranzan.cleanarchitechmvvm.feature_data.domain.repository.NoteRepository
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.AddNote
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.DeleteNote
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.GetNotes
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.NoteUseCases
import org.koin.dsl.module

val appModule = module {
    //define single to make singleton and can also define to return the output as expected.
    single<NoteRepository> { NoteRepositoryImpl(get()) }

    /**
     * The class which will take input need to define how it will be provided.
     *
     * can use    get()      where we have simple class which we want to take input.
     */

    factory { NoteUseCases(get(), get(), get()) }
    factory { DeleteNote(get()) }
    factory { GetNotes(get()) }
    factory { AddNote(get()) }

}