package com.example.hitung_volume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class volume_tabung extends AppCompatActivity {
    final double n = 3.14;
    double x=22;
    double y=7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_tabung);

        final EditText jari = (EditText) findViewById(R.id.editText4);
        final EditText tinggi = (EditText) findViewById(R.id.editText5);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                if(jari.getText().toString().length()==0){

                    jari.setError("masukkan jari-jari");
                }
                else if(tinggi.getText().toString().length()==0)
                {

                    tinggi.setError("masukkan tinggi");
                }
                else{

                    Double jar = Double.parseDouble(jari.getText().toString());
                    Double tingg = Double.parseDouble(tinggi.getText().toString());
                    Double v2 = jar*jar;
                    Double volume =n*v2*tingg;
                    Double volume1 =x/y*v2*tingg;

                    String jarid = String.valueOf(jar);
                    String tinggid = String.valueOf(tingg);
                    String hsl = String.valueOf(volume);
                    String hsl1 = String.valueOf(volume1);
//                        hasil.setText("Hasilnya = " +luas);

                    Intent i = new Intent(volume_tabung.this,hasil_tabung.class);
                    i.putExtra("jari", jarid);
                    i.putExtra("tinggi", tinggid);
                    i.putExtra("hasil", hsl);
                    i.putExtra("hasil1", hsl1);


                    startActivity(i);
                }
//
            }
        });
    }
}
