package com.ranzan.cleanarchitechmvvm.di

import com.ranzan.cleanarchitechmvvm.feature_data.presentation.fragment.NotesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
//    single { NotesViewModel(get()) }
    viewModel { NotesViewModel(get()) }
    /**
     * for view model we have to use viewModel module
     *
     * but if we want to make it singleton then also can use single.
     *
     * for using in different fragment same viewModel we use shared viewModel.
     */
}