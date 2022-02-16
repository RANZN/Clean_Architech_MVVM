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


        /**
         * Crashlytics:
         *  Whenever an application crashes it tells at realtime for how many user it has crashed
         *  and also log about the crash.
         */

        //on button click crash the application.
        crashBtn.setOnClickListener {
            // Creates a button that mimics a crash when pressed

                throw RuntimeException("Test Crash") // Force a crash

        }


        //adding data to room database on the new fragment.
        noteFrag.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, NoteFragment()).commit()
        }

    }
}