package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardpersegi;
    CardView cardpersegipanjang;
    CardView cardsegitiga;
    CardView cardlingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardpersegi = findViewById(R.id.cardpersegi);
        cardpersegipanjang = findViewById(R.id.cardpersegipanjang);
        cardsegitiga = findViewById(R.id.cardsegitiga);
        cardlingkaran = findViewById(R.id.cardlingkaran);

        cardpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Persegi.class);
                startActivity(intent);
            }
        });

        cardpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MoveToPersegipj = new Intent(MainActivity.this, PersegiPanjang.class);
                startActivity(MoveToPersegipj);
            }
        });

        cardsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MovetoSegitiga = new Intent(MainActivity.this, Segitiga.class);
                startActivity(MovetoSegitiga);
            }
        });

        cardlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MovetoLingkaran = new Intent(MainActivity.this, Lingkaran.class);
                startActivity(MovetoLingkaran);
            }
        });


    }
}