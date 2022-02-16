package com.ranzan.cleanarchitechmvvm.feature_data.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.ranzan.cleanarchitechmvvm.feature_data.domain.model.Note

@Database(
    entities = [Note::class],
    version = 3,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        /**
         * Adding up migrations form which version to which versions
         *
         * in migration_2_3 added not null default value but in migration 1_2 didn't because if we dont add not null default then we need to define
         * it in the entity class(Note::class.java)
         *
         *
         *after defining migration we need to add migration while building room database which is being added to UserDatabase.Kt file in di.
         */
        val migration_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE Note ADD COLUMN addNew INTEGER ")
            }
        }
        val migration_2_3 = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE Note ADD COLUMN ph BOOLEAN  NOT NULL DEFAULT(false)")
            }
        }
    }
}