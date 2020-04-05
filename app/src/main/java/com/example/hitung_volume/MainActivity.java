package com.example.hitung_volume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = (EditText) findViewById(R.id.editText3);
        final EditText pass = (EditText) findViewById(R.id.editText2);



            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(user.getText().toString().length()==0){

                        user.setError("masukkan username");
                    }
                    else if(pass.getText().toString().length()==0)
                    {

                        pass.setError("masukkan password");
                    }
                    else{

                        Intent i = new Intent(MainActivity.this,menu.class);
                        i.putExtra("user", user.getText().toString());
                        i.putExtra("pass", pass.getText().toString());
                        startActivity(i);
                    }

                }
            });
    }

    
}
