package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ambilpesanan extends AppCompatActivity {
    ImageView ambilpesanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambilpesanan);
        ambilpesanan = findViewById(R.id. ambilpesanan);
        ambilpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawal = new Intent(ambilpesanan.this, utama3.class);
                startActivity(gotoawal);
            }
        });
    }
}