package com.example.pranesh.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.Bsignup) {
            EditText a = (EditText) findViewById(R.id.TFusername);
            String str = a.getText().toString();

            Intent i = new Intent(MainActivity.this, Display.class);
            i.putExtra("Username", str);
            startActivity(i);
        }
        if (v.getId() == R.id.Bsignup) {
            Intent i = new Intent(MainActivity.this, signup.class);
            startActivity(i);
        }
    }


    public void onButtonClick1(View v) {
        if (v.getId() == R.id.Blogin) {
            EditText a = (EditText) findViewById(R.id.TFusername);
            String s = a.getText().toString();

            Intent i = new Intent(MainActivity.this, Display.class);
            i.putExtra("Username", s);
            startActivity(i);
        }
    }
}
