package com.example.dimasdwicahya.dimasdwicahya_1202152166_modul3;

/**
 * Created by asus a456 on 25/02/2018.
 */

public class Air {
    //deklarasi variable
    int foto;
    String nama, detail;

    //method setter
    public Air(int foto, String nama, String detail) {
        this.foto = foto;
        this.nama = nama;
        this.detail = detail;
    }

    //method getter
    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public String getDetail() {return detail; }
}
