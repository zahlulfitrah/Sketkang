package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class daftarpesanan extends AppCompatActivity {

    ImageView daftarpesanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarpesanan);
        daftarpesanan = findViewById(R.id. daftarpesanan);
        daftarpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawal = new Intent(daftarpesanan.this, ambilpesanan.class);
                startActivity(gotoawal);
            }
        });
    }
}