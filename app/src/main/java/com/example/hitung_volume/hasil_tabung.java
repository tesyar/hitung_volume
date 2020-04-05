package com.example.hitung_volume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasil_tabung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_tabung);
        TextView j = (TextView) findViewById(R.id.textView11);
        TextView t = (TextView) findViewById(R.id.textView12);
        TextView hasilv = (TextView) findViewById(R.id.textView13);
        TextView hasilv1 = (TextView) findViewById(R.id.textView15);
        TextView rumus = (TextView) findViewById(R.id.textView14);
        TextView rumus1 = (TextView) findViewById(R.id.textView17);
//        TextView kelipatan = (TextView) findViewById(R.id.textView16);


//        String sk = j.getText().toString();
        Bundle bundle=getIntent().getExtras();
        String s =bundle.getString("jari");
        j.setText(s +"cm");
        Bundle bundle1=getIntent().getExtras();
        String r =bundle1.getString("tinggi");
        t.setText(r +"cm");

        Bundle bundle2=getIntent().getExtras();
        String x =bundle2.getString("hasil");
        hasilv.setText(x +"cm");

        Bundle bundle3=getIntent().getExtras();
        String y =bundle3.getString("hasil1");
        hasilv1.setText(y);

        rumus.setText("3.14 x" + s + " x " + s + " x " + r);
        rumus1.setText("22/7 x" + s + " x " + s + " x " + r);

//        Double a = Double.valueOf(sk);
//        if(a %7 == 0){
//            rumus.setText("22/7 x" + s + " x " + s + " x " + r);
//        }
//        else {
//            rumus1.setText("3.14 x" + s + " x " + s + " x " + r);
//        }






    }


}
