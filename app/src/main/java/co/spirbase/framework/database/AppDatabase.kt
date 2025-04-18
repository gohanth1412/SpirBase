package co.spirbase.framework.database

import androidx.room.Database
import androidx.room.RoomDatabase
import co.spirbase.framework.database.daointerface.DummyDAO
import co.spirbase.framework.database.entities.DummyEntity

@Database(entities = [DummyEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dummyDAO(): DummyDAO

    companion object {
        const val DATABASE_NAME = "app_db"
    }
}