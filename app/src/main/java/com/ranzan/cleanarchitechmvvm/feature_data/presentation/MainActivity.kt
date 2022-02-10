package com.ranzan.cleanarchitechmvvm.feature_data.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.ranzan.cleanarchitechmvvm.R
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModel<NotesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val note = Note(
            "abcd",
            "content",
            1,
//            2
        )

        addBtn.setOnClickListener {
            viewModel.addData(note)
        }

        getNoteBtn.setOnClickListener {
            viewModel.getNote().observe(this, Observer {
                Log.d("ranzn", "onCreate: $it")
            })
        }

        deleteBtn.setOnClickListener {
            viewModel.deleteNote(note)
        }

    }
}