package com.example.nadia.planyourmoney;

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

        Object testAddValue;
        testAddValue();
    }   // main method

    private void testAddValue() {
        myManage.addUser("name","sur","user","pass");
        myManage.addIncome("date","cat","income","remark");
        myManage.addOutcome("date","cat","outcome","remark");
    }
}   //main class
