package com.ranzan.cleanarchitechmvvm.feature_data.domain.repository

import androidx.lifecycle.LiveData
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note

/**
 * define it as interface it will help in unit testing.
 * as we don't want to wait for unit testing it should be quick so we pass custom values to check and it will be fast.
 */
interface NoteRepository {
    fun getNotes(): LiveData<List<Note>>

    suspend fun getNoteById(id: Int): Note

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}