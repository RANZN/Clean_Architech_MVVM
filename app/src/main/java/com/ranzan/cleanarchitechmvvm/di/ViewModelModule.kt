package com.ranzan.cleanarchitechmvvm.di

import com.ranzan.cleanarchitechmvvm.feature_data.presentation.notes.NotesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { NotesViewModel(get()) }
}