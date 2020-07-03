package com.example.inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etname,etmob,etmail,etpass;
    TextView tv;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2;
    Spinner spd,spm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = findViewById(R.id.editText);
        etmob = findViewById(R.id.editText2);
        etmail = findViewById(R.id.et3);
        etpass = findViewById(R.id.et4);
        tv = findViewById(R.id.tv);
        rb1 =findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        spd = findViewById(R.id.district);
        spm = findViewById(R.id.mandal);
        ArrayAdapter<CharSequence> aapd = ArrayAdapter.createFromResource(this,R.array.dist,android.R.layout.simple_spinner_item);
        spd.setAdapter(aapd);
        spd.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        ArrayAdapter<CharSequence> aapc=ArrayAdapter.createFromResource(MainActivity.this,R.array.ChittorMandal,android.R.layout.simple_spinner_item);
                        spm.setAdapter(aapc);
                        break;
                    case 1:
                        ArrayAdapter<CharSequence> aapg = ArrayAdapter.createFromResource(MainActivity.this,R.array.GunturMandal,android.R.layout.simple_spinner_item);
                        spm.setAdapter(aapg);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void submit(View view) {
        String name=etname.getText().toString(),
                no= etmob.getText().toString(),
                Gender = "unknown",
                email= etmail.getText().toString(),
                pw= etpass.getText().toString(),
                skills="none";
        if(rb1.isChecked())
        {Gender = "MALE";}
        if(rb2.isChecked()){
            Gender = "FEMALE";
        }
        if(cb1.isChecked()){
            if(skills.equals("none")){skills = "";}
            skills+="java \n";
        }
        if (cb2.isChecked()){
            if(skills.equals("none")){skills = "";}
            skills+="IOT \n";
        }
        String sd = spd.getSelectedItem().toString(),
                sm=spm.getSelectedItem().toString();
        Intent aap = new Intent(this,details.class);
        aap.putExtra("name",name);
        aap.putExtra("no",no);
        aap.putExtra("Gender",Gender);
        aap.putExtra("email",email);
        aap.putExtra("pw",pw);
        aap.putExtra("skills",skills);
        aap.putExtra("sd",sd);
        aap.putExtra("sm",sm);
        startActivity(aap);

    }
}