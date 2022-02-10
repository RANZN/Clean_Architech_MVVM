package com.ranzan.cleanarchitechmvvm.feature_data.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ranzan.cleanarchitechmvvm.R
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class BlankFragment : Fragment() {

    private val viewModel by sharedViewModel<NotesViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }
}