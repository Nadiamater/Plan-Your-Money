package com.example.nadia.planyourmoney;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    //explicit
    private MyManage myManage;

    private EditText userEdittext, passwwordEdittext;
    private  String userString, passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bindwidget
        bindWidget();


        //request sqlite

        myManage = new MyManage(this);

        //test add value
        //testAddValue();


    }   // main method


    public void clickLogin(View view) {

        userString = userEdittext.getText().toString().trim();
        passwordString = passwwordEdittext.getText().toString().trim();

        //check space

        if (userString.equals("")|| passwordString.equals("")) {
            //havespace
            myAlert("กรุณากรอกทุกช่องค่ะ");
        } else {
        } // No space
            checkAuthen();

    }   //clickLogin

    private void checkAuthen() {

        //Read data from userTABLE


    }       //checkauthen

    private void myAlert(String strAlert) {
        Toast.makeText(MainActivity.this,strAlert,Toast.LENGTH_SHORT).show();
    }

    private void bindWidget() {
        userEdittext = (EditText)findViewById(R.id.editText5);
        passwwordEdittext =(EditText) findViewById(R.id.editText6);
    }


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
        myManage.addUser("name", "sur", "user", "pass");
        myManage.addIncome("date", "cat", "income", "remark");
        myManage.addOutcome("date", "cat", "outcome", "remark");
    }


}   //main class
