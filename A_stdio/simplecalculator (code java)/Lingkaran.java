package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    TextView tv_hasilluaslingkaran, tv_hasilkelilinglingkaran;
    EditText et_jarijari;
    Button btn_hasil_lingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        tv_hasilluaslingkaran = (TextView) findViewById(R.id.tv_hasilluaslingkaran);
        tv_hasilkelilinglingkaran = (TextView) findViewById(R.id.tv_hasilkelilinglingkaran);
        et_jarijari = (EditText) findViewById(R.id.et_jarijari);
        btn_hasil_lingkaran = (Button) findViewById(R.id.btn_hasil_lingkaran);

        btn_hasil_lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double jarijari,hasilluaslingkaran,hasilkelilinglingkaran;
                String fhasil7,fhasil8;

                //Menghitung Luas Lingkaran
                jarijari = Double.valueOf(et_jarijari.getText().toString().trim());

                hasilluaslingkaran = 3.14 * jarijari * jarijari;
                String hasil7 = String.valueOf(hasilluaslingkaran);
                fhasil7 = hasil7 + " cm*2";

                //Menghitung Keliling
                hasilkelilinglingkaran = 2 * 3.14 * jarijari;
                String hasil8 = String.valueOf(hasilkelilinglingkaran);
                fhasil8 = hasil8 + " cm";

                //Menampilkan pada layar
                tv_hasilluaslingkaran.setText(fhasil7);
                tv_hasilkelilinglingkaran.setText(fhasil8);
            }
        });

    }
}