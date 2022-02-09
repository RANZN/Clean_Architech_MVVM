package com.ranzan.cleanarchitechmvvm.feature_data.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ranzan.cleanarchitechmvvm.R
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import com.ranzan.cleanarchitechmvvm.feature_data.presentation.notes.NotesViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModel<NotesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            val note = Note(
                "abcd",
                "content",
                202930392,
                12
            )
            viewModel.addData(note)
        }
    }
}