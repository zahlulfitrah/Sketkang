package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class utama3 extends AppCompatActivity {
    ImageView utama3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama3);
        utama3 = findViewById(R.id. utama3);
        utama3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawal = new Intent(utama3.this, sidebar.class);
                startActivity(gotoawal);
            }
        });
    }
}