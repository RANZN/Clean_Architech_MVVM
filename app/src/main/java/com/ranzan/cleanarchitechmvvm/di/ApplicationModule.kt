package com.ranzan.cleanarchitechmvvm.di

import com.ranzan.cleanarchitechmvvm.feature_data.data.repository.NoteRepositoryImpl
import com.ranzan.cleanarchitechmvvm.feature_data.domain.repository.NoteRepository
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.AddNote
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.DeleteNote
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.GetNotes
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.NoteUseCases
import org.koin.dsl.module

val appModule = module {
    single<NoteRepository> { NoteRepositoryImpl(get()) }

    factory { NoteUseCases(get(), get(), get()) }
    factory { DeleteNote(get()) }
    factory { GetNotes(get()) }
    factory { AddNote(get()) }
}