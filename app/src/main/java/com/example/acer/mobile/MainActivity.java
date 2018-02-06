package com.example.acer.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button Abnormal,Eatbus;
    EditText menumakanan, porsimakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Eatbus = (Button)findViewById(R.id.1);
        Abnormal = (Button)findViewById(R.id.2);
        menumakanan = (EditText)findViewById(R.id.makanmalam);
        porsimakanan = (EditText)findViewById(R.id.porsi);


        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, MainSecondActivity.class);
                String tempatresto = Abnormal.getText().toString();
                pindah.putExtra("menumakanan", menumakanan.getText().toString());
                pindah.putExtra("tempatresto", tempatresto);
                pindah.putExtra("porsimakanan", porsimakanan.getText().toString());
                startActivity(pindah);

            }
        });

        //untuk eatbus
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,MainSecondAtivityActivity.class);
                String tempatresto = Eatbus.getText().toString();
                pindah.putExtra("menumakanan", menumakanan.getText().toString());
                pindah.putExtra("tempatresto", tempatresto);
                pindah.putExtra("porsimakanan", porsimakanan.getText().toString());
                startActivity(pindah);
            }
        });

    }
}
