package com.example.nadia.planyourmoney;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by admin on 03/17/2016.
 */
public class MyManage {

    //Explicit
    private  MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase;

    public MyManage(Context context) {


        //Create and Connected
        myOpenHelper = new  MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();


    } //constructor
} //main class
