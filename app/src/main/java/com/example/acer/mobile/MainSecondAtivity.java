package com.example.acer.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


import static java.lang.Integer.parseInt;

/**
 * Created by acer on 2/5/2018.
 */

public class MainSecondAtivity extends AppCompatActivity {
    int mymoney = 65000; int biaya, total, hargaTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsecond);
        TextView Makanan = (TextView)findViewById(R.id.makanmalam);
        TextView Qty = (TextView)findViewById(R.id.porsi);
        TextView lokasi = (TextView)findViewById(R.id.dengan2);
        TextView hasil = (TextView)findViewById(R.id.harga);

        Intent i = getIntent();

        String makanan = i.getStringExtra("menumakanan");
        String Lokasi = i.getStringExtra("tempatresto");
        String qty = i.getStringExtra("porsimakanan");

        Makanan.setText(makanan);
        Qty.setText(qty);
        lokasi.setText(Lokasi);

        switch (Lokasi){
            case "EATBUS":
                biaya = 50000;
                break;
            case "ABNORMAL":
                biaya = 30000;
                break;
        }
        total = parseInt(qty) * biaya;
        String hargaTotal = Integer.toString(total);
        if(mymoney < total){
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Sayang sekali uang kamu tidak cukup untuk mkan malam disini", Toast.LENGTH_SHORT).show();
        }else{
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Yap! Kamu bisa makan malam disini", Toast.LENGTH_SHORT).show();
        }
    }
}
