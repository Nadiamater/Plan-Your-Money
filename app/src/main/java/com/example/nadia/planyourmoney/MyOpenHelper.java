package com.example.nadia.planyourmoney;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by admin on 03/17/2016.
 */
public class MyOpenHelper extends SQLiteOpenHelper{


    //explicit
    public static final String database_name = "money.db";
    private static final int database_version = 1;
    private static final  String create_user_table ="create table userTABLE (" +
            "_id integer primary key, " +
            "Name text, " +
            "Surname text," +
            "User text, " +
            "Password text );";

    private static  final String create_income_table = "create table incomeTABLE(" +
            "_id integer primary key, " +
            "Date text, " +
            "Category text, " +
            "Income text, " +
            "Remark text );";
    private static  final String create_outcome_table = "create table outcomeTABLE(" +
            "_id integer primary key, " +
            "Date text, " +
            "Category text, " +
            "Outcome text, " +
            "Remark text );";





    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
    }// constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_income_table);
        sqLiteDatabase.execSQL(create_outcome_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} //main class
