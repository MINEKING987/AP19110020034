package com.example.recyclerview_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String names[] = {"alpha","beta", "Cupcake","Donut",
    "Eclair",
    "Froyo",
    "Gingerbread",
    "Honeycomb",
    "Ice Cream Sandwich",
    "Jelly Bean",
    "KitKat",
    "Lollipop",
    "Marshmallow",
    "Nougat",
    "Oreo",
    "Pie",
    "Q","R"};
    int imgs[] = {R.drawable.alpha,
            R.drawable.beta,
            R.drawable.cupcake,
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.froyo,
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.icecreamsandwich,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop,
            R.drawable.marshmallow,
            R.drawable.nougat,
            R.drawable.oreo,
            R.drawable.pie,
            R.drawable.q,
            R.drawable.r};
    String version[] = {"1.0",
            "1.1",
            "1.5",
            "1.6",
            "2.0 - 2.1",
            "2.2.x",
            "2.3 - 2.3.7",
            "3.0 - 3.2.x",
            "4.0.1 - 4.0.4",
            "4.1 - 4.3.1",
            "4.4 - 4.4.4",
            "5.0 - 5.1",
            "6.0",
            "7.0 - 7.1",
            "8.0 - 8.1",
            "9.0",
            "10.0",
            "11.0"};
    String Apilvl[] = {"Api Level 1",
            "Api Level 2",
            "Api Level 3",
            "Api Level 4",
            "Api Level 5,6,7",
            "Api Level 8",
            "Api Level 9,10",
            "Api Level 11,12,13",
            "Api Level 14,15",
            "Api Level 16,17,18",
            "Api Level 19,20",
            "Api Level 21,22",
            "Api Level 23",
            "Api Level 24,25",
            "Api Level 26,27",
            "Api Level 28",
            "Api Level 29",
            "Api Level 30",
    };
    String release[] = {"September 23, 2008","February 9, 2009","April 27, 2009","September 15,2009",
            "October 26, 2009","May 20, 2010","December 6, 2010","February 22, 2011","October 18, 2011"
            ,"July 9, 2012","October 31, 2013","November 12, 2014","October 5, 2015","August 22,2016"
        ,"August 21, 2017","August 6, 2018","September 3, 2019","February 19 2020"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.Rview);
        rv.setLayoutManager(new LinearLayoutManager(this));
        addapter adap = new addapter(this,names,imgs,version,Apilvl,release);
        rv.setAdapter(adap);
    }
}