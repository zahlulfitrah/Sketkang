package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class daftarpesanansendiri extends AppCompatActivity {

    ImageView daftarpesanansendiri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarpesanansendiri);
        daftarpesanansendiri = findViewById(R.id. daftarpesanansendiri);
        daftarpesanansendiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoawal = new Intent(daftarpesanansendiri.this, utama2.class);
                startActivity(gotoawal);
            }
        });
    }
}