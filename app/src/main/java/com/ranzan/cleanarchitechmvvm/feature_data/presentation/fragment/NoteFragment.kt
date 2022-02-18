package com.ranzan.cleanarchitechmvvm.feature_data.presentation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.ranzan.cleanarchitechmvvm.R
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import kotlinx.android.synthetic.main.activity_main.base64image
import kotlinx.android.synthetic.main.fragment_blank.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class NoteFragment : Fragment() {

    private val viewModel by sharedViewModel<NotesViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val note = Note(
            "abcd",
            "content",
            1,
            true
        )

        addBtn.setOnClickListener {
            viewModel.addData(note)
        }

        getNoteBtn.setOnClickListener {
            viewModel.getNote().observe(viewLifecycleOwner, Observer {
                Log.d("ranzn", "onCreate: $it")
            })
        }

        base64image.setOnClickListener {
            viewModel.deleteNote(note)
        }

    }
}