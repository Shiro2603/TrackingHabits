package com.example.trackinghabits.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.trackinghabits.data.db.entity.HabitEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addHabit(habit: HabitEntity)

    @Query("SELECT * from habit_table")
    fun getAllHabit() : Flow<List<HabitEntity>>

}