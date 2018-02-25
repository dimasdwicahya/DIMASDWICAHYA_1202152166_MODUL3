package com.example.dimasdwicahya.dimasdwicahya_1202152166_modul3;

/**
 * Created by asus a456 on 25/02/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //deklarasikan variable untuk username dan password
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //aksi untuk login
    public void aksiLogin(View view) {
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

        String inputUsername = username.getText().toString();
        String inputPassword = password.getText().toString();

        String isiUsername = "EAD";
        String isiPassword = "MOBILE";


        //cek kondisi login
        if ((inputUsername.matches(isiUsername)) && ((inputPassword.matches(isiPassword)))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            //pindahkan ke halaman Main Activity
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
        //Atau jika username dan password kosong
        else if ((inputUsername.matches("") || inputPassword.matches(""))){

            //Maka akan menampilkan pesan text toast
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();

        } else {
            //jika kedua kondisi diatas tidak memenuhi
            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
        }


    }
}
