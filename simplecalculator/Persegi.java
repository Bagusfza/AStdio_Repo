package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {
    EditText et_psg;
    Button btn_hasil_psg;
    TextView tv_hasil,tv_hasilkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        et_psg = (EditText) findViewById(R.id.et_psg);
        btn_hasil_psg = (Button) findViewById(R.id.btn_hasil_psg);
        tv_hasil = (TextView) findViewById(R.id.tv_hasil);
        tv_hasilkeliling = (TextView) findViewById(R.id.tv_hasilkeliling);

        btn_hasil_psg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sisi, hasil, keliling;
                String fhasil1,fhasil2;

                // Menghitung Luas
                sisi = Double.valueOf(et_psg.getText().toString().trim());
                hasil = sisi*sisi;
                String hasil1 = String.valueOf(hasil);
                fhasil1 = hasil1 + " cm*2";

                //Menghitung Keliling
                keliling = 4*sisi;
                String hasil2 = String.valueOf(keliling);
                fhasil2 = keliling + " cm";

                // Menampilkan pada layar
                tv_hasil.setText(fhasil1);
                tv_hasilkeliling.setText(fhasil2);


            }
        });

    }
}