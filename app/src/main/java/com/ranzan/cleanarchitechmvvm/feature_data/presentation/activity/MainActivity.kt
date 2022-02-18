package com.ranzan.cleanarchitechmvvm.feature_data.presentation.activity

import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Base64
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.ranzan.cleanarchitechmvvm.R
import com.ranzan.cleanarchitechmvvm.feature_data.presentation.fragment.NoteFragment
import com.ranzan.cleanarchitechmvvm.feature_data.presentation.fragment.NotesViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {
    private val viewModel by viewModel<NotesViewModel>()
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtain the FirebaseAnalytics instance.
//        firebaseAnalytics = Firebase.analytics
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)
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


        /**
         * int the encodedImage the data type and extensions other details are mentioned so first remove it or split it form , and take other part..
         * then decode the string to byteArray using BASE64.decode() and pass parameters
         * then using BitmapFactory decode it and define offset
         *
         * now set decodeByte to imageView using setImageBitmap or through Glide.
         */
        base64image.setOnClickListener {
            val encodedImage =
                "data:image/png;base64,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"
            val base64Image: String = encodedImage.split(",")[1]
            val decodedString: ByteArray = Base64.decode(base64Image, Base64.DEFAULT)
            val decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.size)
            imageView.setImageBitmap(decodedByte)
//            Glide.with(imageView).load(decodedByte).fitCenter().into(imageView)
        }
        //adding data to room database on the new fragment.
        noteFrag.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, NoteFragment()).addToBackStack("").commit()
        }

    }
}