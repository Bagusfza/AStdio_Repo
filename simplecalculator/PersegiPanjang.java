package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {
    TextView tv_hasilLuaspsgpj, tv_hasilKelilingpsgpj;
    Button btn_hasilpsgpj;
    EditText et_panjangpsgpj, et_lebarpsgpj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        tv_hasilLuaspsgpj = (TextView) findViewById(R.id.tv_hasilLuaspsgpj);
        tv_hasilKelilingpsgpj = (TextView) findViewById(R.id.tv_hasilKelilingpsgpj);
        btn_hasilpsgpj = (Button) findViewById(R.id.btn_hasil_psgpj);
        et_lebarpsgpj = (EditText) findViewById(R.id.et_lebarpsgpj);
        et_panjangpsgpj = (EditText) findViewById(R.id.et_panjangpsgpj);

        btn_hasilpsgpj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double panjang,lebar,hasilluas,hasilkeliling;
                String fhasil3, fhasil4;

                //Menghitung Luas
                panjang = Double.valueOf(et_panjangpsgpj.getText().toString().trim());
                lebar = Double.valueOf(et_lebarpsgpj.getText().toString().trim());
                hasilluas = panjang*lebar;
                String hasil3 = String.valueOf(hasilluas);
                fhasil3 = hasil3 + " cm*2";

                //Menghitung Keliling
                hasilkeliling = 2*(panjang+lebar);
                String hasil4 = String.valueOf(hasilkeliling);
                fhasil4 = hasil4 + " cm";

                //Menampilkan pada layar
                tv_hasilLuaspsgpj.setText(fhasil3);
                tv_hasilKelilingpsgpj.setText(fhasil4);

            }
        });
    }
}