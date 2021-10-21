package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    TextView tv_hasilluassegitiga, tv_hasilkelilingsegitiga;
    EditText et_tinggisegitiga, et_alassegitiga, et_sisisegitiga;
    Button btn_segitiga, btn_kelilingsegitiga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        tv_hasilluassegitiga = (TextView) findViewById(R.id.tv_hasilluassegitiga);
        tv_hasilkelilingsegitiga = (TextView) findViewById(R.id.tv_hasilkelilingsegitiga);
        et_tinggisegitiga = (EditText) findViewById(R.id.et_tinggisegitiga);
        et_alassegitiga = (EditText) findViewById(R.id.et_alassegitiga);
        et_sisisegitiga = (EditText) findViewById(R.id.et_sisisegitiga);
        btn_segitiga = (Button) findViewById(R.id.btn_segitiga);
        btn_kelilingsegitiga =(Button) findViewById(R.id.btn_kelilingsegitiga);

        btn_segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tinggi, alas, hasilluassegitiga;
                String fhasil5;

                //Menghitung Luas
                tinggi = Double.valueOf(et_tinggisegitiga.getText().toString().trim());
                alas = Double.valueOf(et_alassegitiga.getText().toString().trim());

                hasilluassegitiga = 0.5*(alas*tinggi);
                String hasil5 = String.valueOf(hasilluassegitiga);
                fhasil5 = hasil5 + " cm*2";

                //menampilkan pada layar
                tv_hasilluassegitiga.setText(fhasil5);
            }
        });

        btn_kelilingsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sisi1,hasilkeliling;
                String fhasil6;

                //Menghitung Keliling
                sisi1 = Double.valueOf(et_sisisegitiga.getText().toString().trim());

                hasilkeliling = sisi1 + sisi1 + sisi1;
                String hasil6 = String.valueOf(hasilkeliling);
                fhasil6 = hasil6 + " cm";

                //Menampilkan Keliling
                tv_hasilkelilingsegitiga.setText(fhasil6);

            }
        });

    }
}