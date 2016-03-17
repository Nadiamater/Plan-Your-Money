package com.example.nadia.planyourmoney;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    //explicit
    private MyManage myManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //request sqlite
        myManage = new MyManage(this);

        //test add value
        //testAddValue();


    }   // main method


    @Override
    protected void onStart() {
        super.onStart();


        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + MyManage.user_table, null);
        cursor.moveToFirst();

        if (cursor.getCount() == 0) {
           startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        }
        cursor.close();
    }   //onStart

    private void testAddValue() {
        myManage.addUser("name","sur","user","pass");
        myManage.addIncome("date","cat","income","remark");
        myManage.addOutcome("date","cat","outcome","remark");
    }
}   //main class
