package com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case

import androidx.lifecycle.LiveData
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import com.ranzan.cleanarchitechmvvm.feature_data.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val repository: NoteRepository
) {
    operator fun invoke(): LiveData<List<Note>> {
        return repository.getNotes()
    }
}