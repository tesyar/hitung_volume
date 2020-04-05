package com.example.hitung_volume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class volume_balok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_balok);

        final EditText panjang = (EditText) findViewById(R.id.editText);
        final EditText lebar = (EditText) findViewById(R.id.editText6);
        final EditText tinggi = (EditText) findViewById(R.id.editText7);

        Button button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                if(panjang.getText().toString().length()==0){

                    panjang.setError("masukkan panjang");
                }
                else if(lebar.getText().toString().length()==0)
                {

                    lebar.setError("masukkan lebar");
                }
                else if(tinggi.getText().toString().length()==0)
                {

                    tinggi.setError("masukkan tinggi");
                }
                else{

                    Double pan = Double.parseDouble(panjang.getText().toString());
                    Double leb = Double.parseDouble(lebar.getText().toString());
                    Double tingg = Double.parseDouble(tinggi.getText().toString());
//                    Double v2 = pan*pan;
                    Double volumeb =pan*leb*tingg;
//                    Double volume1 =x/y*v2*tingg;

                    String jarid = String.valueOf(pan);
                    String lebard = String.valueOf(leb);
                    String tinggid = String.valueOf(tingg);
                    String hsl = String.valueOf(volumeb);
//                    String hsl1 = String.valueOf(volume1);
//                        hasil.setText("Hasilnya = " +luas);

                    Intent i = new Intent(volume_balok.this,hasil_balok.class);
                    i.putExtra("panjang", jarid);
                    i.putExtra("lebar", lebard);
                    i.putExtra("tinggib", tinggid);
                    i.putExtra("hasilb", hsl);
//                    i.putExtra("hasil1", hsl1);


                    startActivity(i);
                }
//
            }
        });
    }
}
