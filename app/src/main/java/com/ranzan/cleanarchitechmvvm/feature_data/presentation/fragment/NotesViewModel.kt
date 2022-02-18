package com.ranzan.cleanarchitechmvvm.feature_data.presentation.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.NoteUseCases
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class NotesViewModel(private val noteUseCases: NoteUseCases) : ViewModel(),KoinComponent {

    /**
     * here used operator fun invoke() so need not to call another function invoke again.
     */
    fun addData(note: Note) {
        viewModelScope.launch {
            noteUseCases.addNote(note)
        }
    }

    fun getNote(): LiveData<List<Note>> {
        return noteUseCases.getNotes()
    }

    /**
     * Here had not used operator fun invoke() so had to again call that method
     */
    fun deleteNote(note: Note) {
        viewModelScope.launch {
            noteUseCases.deleteNote.abcd(note)
        }
    }

}