package com.ranzan.cleanarchitechmvvm.feature_data.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ranzan.cleanarchitechmvvm.ui.*

@Entity(tableName = "Note")
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
