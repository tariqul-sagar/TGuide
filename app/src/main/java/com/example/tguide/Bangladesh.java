package com.example.tguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bangladesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangladesh);

    }

    public void ahsan(View view) {
        Intent intent=new Intent(Bangladesh.this,ahsan.class);
        startActivity(intent);
    }

    public void sajek(View view) {
        Intent intent=new Intent(Bangladesh.this,Sajek.class);
        startActivity(intent);
    }

    public void bihar(View view) {
        Intent intent=new Intent(Bangladesh.this,Bihar.class);
        startActivity(intent);
    }

    public void cox(View view) {
        Intent intent=new Intent(Bangladesh.this,Cox.class);
        startActivity(intent);
    }
}