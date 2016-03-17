package com.example.nadia.planyourmoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    //explicit
    private EditText nameEditText, surnameEditText, userEditTextEditText, passwordEditTextEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Bind Widget
        bindWidget();

    }   //main Method

    public void clickRegister(View view) {

        String strName = nameEditText.getText().toString().trim();
        String strSurname = surnameEditText.getText().toString().trim();
        String strUser = userEditTextEditText.getText().toString().trim();
        String strPassword = passwordEditTextEditText.getText().toString().trim();

        //check space
        if (strName.equals("")||
                strSurname.equals("")||
                strUser.equals("")||
                strPassword.equals("")) {
            //Have Space
            myAlert("กรุณากรอกให้ครบทุกช่องค่ะ");
        } else {

            //No Space
        }

    }   //clickregister

    private void myAlert(String strAlert) {
        Toast.makeText(RegisterActivity.this, strAlert, Toast.LENGTH_SHORT).show();

    }

    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        surnameEditText =(EditText) findViewById(R.id.editText2);
        userEditTextEditText =(EditText) findViewById(R.id.editText3);
        passwordEditTextEditText = (EditText) findViewById(R.id.editText4);
    }


}   //main class
