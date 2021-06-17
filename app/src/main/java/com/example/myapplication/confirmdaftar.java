package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class confirmdaftar extends AppCompatActivity {
    ImageView confirmdaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmdaftar);
        confirmdaftar = findViewById(R.id. confrimdaftar);
        confirmdaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawal = new Intent(confirmdaftar.this, utama.class);
                startActivity(gotoawal);
            }
        });
    }
}