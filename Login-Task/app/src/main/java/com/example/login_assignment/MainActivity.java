package com.example.login_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    String uname;
    String pass;
    String Suname;
    String Spass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        Suname =getIntent().getStringExtra("Suname");
        Spass = getIntent().getStringExtra("Spass");

    }

    public void log(View view) {
        uname = et1.getText().toString();
        pass = et2.getText().toString();

        if(uname == null || pass == null || !uname.equals(Suname) || !pass.equals(Spass))
        {
            Toast.makeText(this,"check Username and password or register",Toast.LENGTH_SHORT).show();
        }
        else{
        Intent log = new Intent(MainActivity.this,logged.class);
        log.putExtra("name",uname);
        startActivity(log);
        }
    }

    public void reg(View view) {
        Intent reg = new Intent(this,Register.class);
        startActivity(reg);

    }
}