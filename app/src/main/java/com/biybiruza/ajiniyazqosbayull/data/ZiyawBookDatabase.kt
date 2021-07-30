package com.biybiruza.ajiniyazqosbayull.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.biybiruza.ajiniyazqosbayull.data.dao.ZiywarDao
import com.biybiruza.ajiniyazqosbayull.data.model.Ziywar

@Database(entities = [Ziywar::class], version = 1)
abstract class ZiyawBookDatabase : RoomDatabase(){
    companion object{
        private lateinit var INSTANCE: ZiyawBookDatabase

        fun getIsnance(context: Context) : ZiyawBookDatabase =
            Room.databaseBuilder(
                context,
                ZiyawBookDatabase::class.java,
                "ziywar.db"
            )
                .createFromAsset("ziywar.db")
                .allowMainThreadQueries()
                .build()
    }

    abstract fun dao() : ZiywarDao
}