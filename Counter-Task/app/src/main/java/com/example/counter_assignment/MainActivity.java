package com.example.counter_assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.Tv);
        tv.setText(""+x);
        if(savedInstanceState != null)
        {
            x = savedInstanceState.getInt("data");
            tv.setText(""+x);
        }
    }

    public void add(View view) {
        x++;
        tv.setText(""+x);
    }

    public void sub(View view) {
        x--;
        tv.setText(""+x);
    }

    public void res(View view) {
        x = 0;
        tv.setText(""+x);
    }

    public void Tos(View view) {
        Toast.makeText(this,"The count is "+x,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("data",x);
    }
}