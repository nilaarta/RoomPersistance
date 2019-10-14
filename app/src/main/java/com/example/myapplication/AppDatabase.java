package com.example.myapplication;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {PhoneBook.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract PhonebookDAO phonebookDAO();
}
