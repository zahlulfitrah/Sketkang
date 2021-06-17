package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class utama2 extends AppCompatActivity {

    ImageView utama2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama2);
        utama2 = findViewById(R.id. utama2);
        utama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawal = new Intent(utama2.this, daftarpesanan.class);
                startActivity(gotoawal);
            }
        });
    }
}