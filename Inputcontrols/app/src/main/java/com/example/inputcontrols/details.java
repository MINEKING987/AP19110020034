package com.example.inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class details extends AppCompatActivity {
    TextView tvd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tvd = findViewById(R.id.tvd);
        Bundle xtra=getIntent().getExtras();
        String name=xtra.getString("name"),
                no=xtra.getString("no"),
                Gender=xtra.getString("Gender"),
                email=xtra.getString("email"),
                pw=xtra.getString("pw"),
                skills=xtra.getString("skills"),sd=xtra.getString("sd"),
                sm=xtra.getString("sm");
        tvd.setText(name+"\n"+no+"\n"+email+"\n"+pw+"\n"+Gender+"\n"+"Skills: \n"+skills+"\n"+"District: "+sd+"\n"+"Mandal: "+sm);
    }
}