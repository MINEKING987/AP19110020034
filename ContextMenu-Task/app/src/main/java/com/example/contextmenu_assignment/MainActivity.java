package com.example.contextmenu_assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        registerForContextMenu(tv1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_1,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.notif:
                Toast.makeText(this,"Notifications",Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this,"Help Activity",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sets:
                Toast.makeText(this,"Settings Activity",Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(this,"Logout Activity",Toast.LENGTH_SHORT).show();
                break;
                };


        return super.onContextItemSelected(item);
    }
}