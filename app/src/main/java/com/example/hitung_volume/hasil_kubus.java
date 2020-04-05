package com.example.hitung_volume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasil_kubus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kubus);

        TextView tvs = (TextView) findViewById(R.id.textView28);
        TextView hasilvk = (TextView) findViewById(R.id.textView32);
        TextView rumusk = (TextView) findViewById(R.id.textView30);


        Bundle bundle=getIntent().getExtras();
        String vs =bundle.getString("sisi");
        tvs.setText(vs +"cm");
        Bundle bundle2=getIntent().getExtras();
        String hk =bundle2.getString("hasilk");
        hasilvk.setText(hk);

        rumusk.setText( vs + " x " + vs + " x " + vs);
    }
}
