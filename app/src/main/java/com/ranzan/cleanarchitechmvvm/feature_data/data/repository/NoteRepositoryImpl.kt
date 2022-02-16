package com.ranzan.cleanarchitechmvvm.feature_data.data.repository

import androidx.lifecycle.LiveData
import com.ranzan.cleanarchitechmvvm.feature_data.data.data_source.NoteDao
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import com.ranzan.cleanarchitechmvvm.feature_data.domain.repository.NoteRepository

/**
 * implement the interface here and define all logics here
 */
class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun getNotes(): LiveData<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note {
        return noteDao.getNoteById(id)!!
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}