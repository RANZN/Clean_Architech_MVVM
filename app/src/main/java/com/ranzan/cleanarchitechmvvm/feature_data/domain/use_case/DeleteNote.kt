package com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case

import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import com.ranzan.cleanarchitechmvvm.feature_data.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}