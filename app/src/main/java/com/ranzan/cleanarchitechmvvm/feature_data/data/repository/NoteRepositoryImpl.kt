package com.ranzan.cleanarchitechmvvm.feature_data.data.repository

import com.ranzan.cleanarchitechmvvm.feature_data.data.data_source.NoteDao
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import com.ranzan.cleanarchitechmvvm.feature_data.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
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