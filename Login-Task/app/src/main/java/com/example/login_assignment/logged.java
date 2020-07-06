package com.example.login_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class logged extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        String name = getIntent().getStringExtra("name");
        TextView tv = findViewById(R.id.tv1);
        tv.append(""+name);
    }
}