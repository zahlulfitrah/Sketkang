package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class buatpesanan extends AppCompatActivity {

    ImageView buatpesanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buatpesanan);
        buatpesanan = findViewById(R.id. buatpesanan);
        buatpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawal = new Intent(buatpesanan.this, daftarpesanansendiri.class);
                startActivity(gotoawal);
            }
        });
    }
}