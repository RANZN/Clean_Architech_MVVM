package com.ranzan.cleanarchitechmvvm.feature_data.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Note")
data class Note(
    val title: String,
    val content: String,
    @PrimaryKey val id: Int? = null
)
