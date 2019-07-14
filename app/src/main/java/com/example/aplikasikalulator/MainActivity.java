package com.example.aplikasikalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    TextView jumlah;
    Button tambah, kurang, kali, bagi, bersihkan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        angka_pertama = (EditText) findViewById(R.id.angka1);
        angka_kedua = (EditText) findViewById(R.id.angka2);
        jumlah = (TextView) findViewById(R.id.jumlah);
        tambah = (Button) findViewById(R.id.plusbtn);
        kurang = (Button) findViewById(R.id.minbtn);
        kali = (Button) findViewById(R.id.timesbtn);
        bagi = (Button) findViewById(R.id.dividebtn);
        bersihkan = (Button) findViewById(R.id.clr);


        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
                {
                    double angkainp1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angkainp2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angkainp1+angkainp2;
                    jumlah.setText(Double.toString(result));
                    tambah.onEditorAction(EditorInfo.IME_ACTION_DONE);
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
                {
                    double angkainp1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angkainp2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angkainp1-angkainp2;
                    jumlah.setText(Double.toString(result));
                    kurang.onEditorAction(EditorInfo.IME_ACTION_DONE);
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
                {
                    double angkainp1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angkainp2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angkainp1*angkainp2;
                    jumlah.setText(Double.toString(result));
                    kali.onEditorAction(EditorInfo.IME_ACTION_DONE);
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
                {
                    double angkainp1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angkainp2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angkainp1/angkainp2;
                    jumlah.setText(Double.toString(result));
                    bagi.onEditorAction(EditorInfo.IME_ACTION_DONE);
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                jumlah.setText("");
                angka_pertama.requestFocus();
            }
        });
    }

}

