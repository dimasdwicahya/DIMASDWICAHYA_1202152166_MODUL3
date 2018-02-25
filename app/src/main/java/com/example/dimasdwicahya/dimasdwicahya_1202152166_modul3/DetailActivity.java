package com.example.dimasdwicahya.dimasdwicahya_1202152166_modul3;

/**
 * Created by asus a456 on 25/02/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    //deklarasi variable
    ImageView gambar, galon;
    TextView nama, detail, liter;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Air"); //set title bar

        //memanggil gambar, nama, detail, liter, baterai yang ada di layout
        gambar = findViewById(R.id.imgMerk);
        nama = findViewById(R.id.tvMerk);
        detail = findViewById(R.id.tvDeskripsi);
        liter = findViewById(R.id.tvLiter);
        galon = findViewById(R.id.imgIsi);

        //set gambar,nama dan detail item di dapat intent
        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("foto"))));
        nama.setText(getIntent().getStringExtra("nama"));
        detail.setText(getIntent().getStringExtra("detail"));

        //set baterai pada level rendah
        galon.setImageLevel(0);
    }

    //method untuk button minus
    public void minus(View view) {
        if (galon.getDrawable().getLevel() - 1 >= 0) {
            total = total - 2;
            liter.setText(total + "L");
            galon.setImageLevel(galon.getDrawable().getLevel() - 1);
        } else {
            galon.setImageLevel(0);
            Toast.makeText(this, "Habis", Toast.LENGTH_LONG).show();
        }
    }

    //method untuk button plus
    public void tambah(View view) {
        if (galon.getDrawable().getLevel() + 1 <= 5) {
            total = total + 2;
            liter.setText(total + "L");
            galon.setImageLevel(galon.getDrawable().getLevel() + 1);
        } else {
            galon.setImageLevel(5);
            Toast.makeText(this, "Penuh", Toast.LENGTH_LONG).show();
        }
    }
}
