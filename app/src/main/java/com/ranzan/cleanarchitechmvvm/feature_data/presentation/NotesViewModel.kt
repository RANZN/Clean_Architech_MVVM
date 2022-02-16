package com.ranzan.cleanarchitechmvvm.feature_data.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case.NoteUseCases
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class NotesViewModel(private val noteUseCases: NoteUseCases) : ViewModel(),KoinComponent {
    fun addData(note: Note) {
        viewModelScope.launch {
            noteUseCases.addNote.invoke(note)
        }
    }

    fun getNote(): LiveData<List<Note>> {
        return noteUseCases.getNotes.invoke()
    }

    fun deleteNote(note: Note) {
        viewModelScope.launch {
            noteUseCases.deleteNote.abcd(note)
        }
    }

}