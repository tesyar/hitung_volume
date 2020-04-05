package com.example.hitung_volume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasil_balok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_balok);

        TextView tvp = (TextView) findViewById(R.id.textView23);
        TextView tvl = (TextView) findViewById(R.id.textView25);
        TextView tvt = (TextView) findViewById(R.id.textView24);
        TextView hasilvb = (TextView) findViewById(R.id.textView27);
        TextView rumusb = (TextView) findViewById(R.id.textView26);


        Bundle bundle=getIntent().getExtras();
        String vs =bundle.getString("panjang");
        tvp.setText(vs +"cm");
        Bundle bundlet=getIntent().getExtras();
        String vt =bundlet.getString("lebar");
        tvl.setText(vt +"cm");
        Bundle bundle1=getIntent().getExtras();
        String vl =bundle1.getString("tinggib");
        tvt.setText(vl +"cm");

        Bundle bundle2=getIntent().getExtras();
        String hb =bundle2.getString("hasilb");
        hasilvb.setText(hb);

//        Bundle bundle3=getIntent().getExtras();
//        String y =bundle3.getString("hasil1");
//        rumus.setText(y +"cm");

        rumusb.setText( vs + " x " + vt + " x " + vl);







    }

}
