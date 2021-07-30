package com.biybiruza.ajiniyazqosbayull.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ziywar")
data class Ziywar (
    @PrimaryKey val id: Int,
    @ColumnInfo(name="type") val type: Int,
    @ColumnInfo(name="name") val name: String,
    @ColumnInfo(name="text") val text: String
)