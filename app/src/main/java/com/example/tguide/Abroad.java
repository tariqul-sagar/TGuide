package com.example.tguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Abroad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abroad);
    }

    public void cliffs(View view) {
        Intent intent =new Intent(Abroad.this,Cliff.class);
        startActivity(intent);
    }

    public void troll(View view) {
        Intent intent =new Intent(Abroad.this,Troll.class);
        startActivity(intent);
    }

    public void stor(View view) {
        Intent intent =new Intent(Abroad.this,Stor.class);
        startActivity(intent);
    }

    public void coast(View view) {
        Intent intent =new Intent(Abroad.this,Coast.class);
        startActivity(intent);
    }
}