package com.biybiruza.ajiniyazqosbayull.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.biybiruza.ajiniyazqosbayull.data.model.Ziywar

@Dao
interface ZiywarDao {
    @Query("SELECT * FROM ziywar WHERE type = :type")
    fun getAllZiywar(type: Int): List<Ziywar>
}