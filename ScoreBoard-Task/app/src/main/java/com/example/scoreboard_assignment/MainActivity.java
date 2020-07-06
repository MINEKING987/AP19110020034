package com.example.scoreboard_assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int A=0;
    int B=0;
    TextView tv1;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1= findViewById(R.id.textView3);
        tv2= findViewById(R.id.textView4);
        tv1.setText(""+A);
        tv2.setText(""+B);
        if(savedInstanceState != null)
        {
            A = savedInstanceState.getInt("aval");
            B = savedInstanceState.getInt("bval");
            tv1.setText(""+A);
            tv2.setText(""+B);
        }
    }

    public void Aone(View view) {
        A++;
        tv1.setText(""+A);
    }

    public void Bone(View view) {
        B++;
        tv2.setText(""+B);
    }
    public void Atwo(View view) {
        A=A+2;
        tv1.setText(""+A);
    }
    public void Btwo(View view) {
        B=B+2;
        tv2.setText(""+B);
    }
    public void Btree(View view) {
        B=B+3;
        tv2.setText(""+B);
    }
    public void Atree(View view) {
        A=A+3;
        tv1.setText(""+A);
    }
    public void reset(View view) {
        A=0;
        B=0;
        tv1.setText(""+A);
        tv2.setText(""+B);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("aval",A);
        outState.putInt("bval",B);
    }
}