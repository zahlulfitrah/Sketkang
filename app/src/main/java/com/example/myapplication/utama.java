package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class utama extends AppCompatActivity {

    ImageView utama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
        utama = findViewById(R.id. utama);
        utama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawal = new Intent(utama.this, buatpesanan.class);
                startActivity(gotoawal);
            }
        });
    }
}