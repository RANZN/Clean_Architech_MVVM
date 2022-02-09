package com.ranzan.cleanarchitechmvvm.feature_data.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao

}