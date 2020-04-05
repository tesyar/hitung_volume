package com.example.hitung_volume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class volume_kubus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_kubus);

        final EditText sisi = (EditText) findViewById(R.id.editText8);


        Button button = (Button) findViewById(R.id.btn5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                if(sisi.getText().toString().length()==0){

                    sisi.setError("masukkan sisi");
                }

                else{

                    Double sis = Double.parseDouble(sisi.getText().toString());
                    Double volumek =sis*sis*sis;

                    String sisid = String.valueOf(sis);
                    String hsl = String.valueOf(volumek);
                    Intent i = new Intent(volume_kubus.this,hasil_kubus.class);
                    i.putExtra("sisi", sisid);
                    i.putExtra("hasilk", hsl);

                    startActivity(i);
                }
//
            }
        });
    }
}
