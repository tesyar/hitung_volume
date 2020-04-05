package com.example.hitung_volume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView t = (TextView) findViewById(R.id.textView10);
        Bundle bundle=getIntent().getExtras();
        String s =bundle.getString("user");
        t.setText(s);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this,MainActivity.class);
//                i.putExtra("user", user.getText().toString());
//                i.putExtra("pass", pass.getText().toString());
                startActivity(i);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.tbng:
                intent = new Intent(getApplicationContext(),volume_tabung.class);
                startActivity(intent);
                break;
            case R.id.blk:
                intent = new Intent(getApplicationContext(),volume_balok.class);
                startActivity(intent);
                break;
            case R.id.kbs:
                intent = new Intent(getApplicationContext(),volume_kubus.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }



}
