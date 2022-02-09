package com.ranzan.cleanarchitechmvvm.di

import com.ranzan.cleanarchitechmvvm.feature_data.presentation.NotesViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { NotesViewModel(get()) }
//    viewModel { NotesViewModel(get()) }
}