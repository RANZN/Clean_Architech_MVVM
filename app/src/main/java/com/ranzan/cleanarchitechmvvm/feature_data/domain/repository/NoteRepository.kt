package com.ranzan.cleanarchitechmvvm.feature_data.domain.repository

import androidx.lifecycle.LiveData
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note

interface NoteRepository {
    fun getNotes(): LiveData<List<Note>>

    suspend fun getNoteById(id: Int): Note

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}