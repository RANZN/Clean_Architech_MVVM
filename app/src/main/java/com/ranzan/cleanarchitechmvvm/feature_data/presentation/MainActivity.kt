package com.ranzan.cleanarchitechmvvm.feature_data.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ranzan.cleanarchitechmvvm.R
import com.ranzan.cleanarchitechmvvm.feature_data.presentation.notes.NotesViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModel<NotesViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}