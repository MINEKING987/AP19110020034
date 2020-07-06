package com.example.login_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    String name;
    String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et1 = findViewById(R.id.editText3);
        et2 = findViewById(R.id.editText4);
        et3 = findViewById(R.id.editText5);
        et4 = findViewById(R.id.editText6);
    }

    public void main(View view) {
        name = et1.getText().toString();
        pass = et3.getText().toString();
        Intent main = new Intent(this,MainActivity.class);
        main.putExtra("Suname",name);
        main.putExtra("Spass",pass);
        startActivity(main);
    }
}