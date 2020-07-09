package com.example.recyclerview_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String names[] = {"android 1.5: android Cupcake",
    "Android 1.6: Android Donut",
    "Android 2.0: Android Eclair",
    "Android 2.2: Android Froyo",
    "Android 2.3: Android Gingerbread",
    "Android 3.0: Android Honeycomb",
    "Android 4.0: Android Ice Cream Sandwich",
    "Android 4.1 to 4.3.1: Android Jelly Bean",
    "Android 4.4 to 4.4.4: Android KitKat",
    "Android 5.0 to 5.1.1: Android Lollipop",
    "Android 6.0 to 6.0.1: Android Marshmallow",
    "Android 7.0 to 7.1: Android Nougat",
    "Android 8.0 to Android 8.1: Android Oreo",
    "Android 9.0: Android Pie",
    "Android 10 : Android Q"};
    int imgs[] = {R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.Rview);
        rv.setLayoutManager(new LinearLayoutManager(this));
        addapter adap = new addapter(this,names,imgs);
        rv.setAdapter(adap);
    }
}