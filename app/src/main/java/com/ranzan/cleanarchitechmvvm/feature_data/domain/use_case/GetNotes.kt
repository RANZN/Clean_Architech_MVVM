package com.ranzan.cleanarchitechmvvm.feature_data.domain.use_case

import androidx.lifecycle.LiveData
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note
import com.ranzan.cleanarchitechmvvm.feature_data.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val repository: NoteRepository
) {

    /**
     *    If we use operator fun invoke() then we can directly call getNotes() where we want to
     *
     *    See at Delete note called without overriding invoke operator
     *    also see in viewModel the difference between them.
     */

    operator fun invoke(): LiveData<List<Note>> {
        return repository.getNotes()
    }
}