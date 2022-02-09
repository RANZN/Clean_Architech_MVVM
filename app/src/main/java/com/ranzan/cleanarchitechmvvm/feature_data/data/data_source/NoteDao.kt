package com.ranzan.cleanarchitechmvvm.feature_data.data.data_source

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM Note")
    fun getNotes(): LiveData<List<Note>>

    @Query("select * from Note where id=:id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}