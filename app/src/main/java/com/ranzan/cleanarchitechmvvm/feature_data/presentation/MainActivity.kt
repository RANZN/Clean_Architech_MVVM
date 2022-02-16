package com.ranzan.cleanarchitechmvvm.feature_data.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ranzan.cleanarchitechmvvm.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModel<NotesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        crashBtn.setOnClickListener {
            // Creates a button that mimics a crash when pressed

                throw RuntimeException("Test Crash") // Force a crash

        }

        noteFrag.setOnClickListener {

            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, BlankFragment()).commit()
        }

    }
}