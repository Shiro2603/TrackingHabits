package com.example.trackinghabits.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.trackinghabits.data.db.dao.HabitDao
import com.example.trackinghabits.data.db.entity.HabitEntity

@Database(version = 1, entities = [HabitEntity::class])
abstract class AppDatabase : RoomDatabase() {

    abstract fun HabitDao(): HabitDao

}