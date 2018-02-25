package com.example.dimasdwicahya.dimasdwicahya_1202152166_modul3;

/**
 * Created by asus a456 on 25/02/2018.
 */


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //deklarasi variable
    RecyclerView rv;
    Adapter adapter;
    List<Air> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UNTUK JUDUL LAYAR
        setTitle("Daftar Air Mineral");


        //MEMBUAT ARRAYLIST
        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu); //mendeklarasikan recyclerview
        rv.setHasFixedSize(true);

        //UNTUK ORIENTASI LAYAR LANDSCAPE
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rv.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        } else {
            rv.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
        }
        initdata(); //EKSEKUSI
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rv.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        } else {
            rv.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
        }
    }

    private void initdata() {
        //masukkan data ke dalam array
        listmenu.add(new Air(R.drawable.aqua, "Aqua", "Ini adalah air mineral kemasan Aqua. \n AQUA berasal dari sumber mata air yang terpilih dengan segala kemurnian dan kandungan mineral alami yang terpelihara. AQUA dikemas dengan proses higienis dalam beberapa ukuran kemasan botol plastik;\n 330 ml, 600 ml, 750 ml dan 1500 ml serta kemasan gelas plastik ukuran 240 ml dan kemasan galon 19 Liter"));
        listmenu.add(new Air(R.drawable.pristine, "Pristine", "ini adalah air mineral kemasan Pristine. \n Air minum yang bersih adalah air minum beralkali yang di proses ionisasi, air minum pristine adalah air alkali dengan ph 8 yang bermanfaat untuk kesehatan, air minum kemasan praktis dan ekonomis."));
        listmenu.add(new Air(R.drawable.leminerale, "Le Minerale", " Le Minerale, air minum berbotol plastik buatan Tirta Fresindo Jaya yang baru saja keluar tahun 2015 benar-benar terasa “ada manis-manisnya”"));
        listmenu.add(new Air(R.drawable.cleo, "Cleo", "ini adalah air mineral kemasan Cleo. \nPMengapa Cleo terasa hambar? Inilah sensasi air murni. Air jenis ini terasa lebih ringan dan tidak berasa bila diminum, karena mineral-mineral yang sedikit-banyak berkontribusi memberi rasa pada air telah disisihkan. Apa beda air murni dan air mineral? "));
        listmenu.add(new Air(R.drawable.club, "Club", "ini adalah air mineral kemasan Club. \nClub adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur"));
        listmenu.add(new Air(R.drawable.nestle, "Nestle", "ini adalah air mineral kemasan Nestle. \nNESTLE Pure Life Mineral Water 24 x 330ml. Dapatkan kembali kesegaran sebelum, selama dan sesudah beraktivitas dengan mengkonsumsi air minum mineral persembahan dari Nestle."));
        listmenu.add(new Air(R.drawable.vit, "Vit", "ini adalah air mineral kemasan VIT. \n VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. "));
        listmenu.add(new Air(R.drawable.ades, "Ades", "ini adalah air mineral kemasan Ades. \nAdes Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. "));
        listmenu.add(new Air(R.drawable.amidis, "Amidis", "ini adalah air mineral  kemasan Amidis. \n AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain"));
        listmenu.add(new Air(R.drawable.equil, "Equil", "ini adalah air mineral kemasan Equil. \n  Equil merupakan air mineral yang memiliki kemasan elegan dan saat ini satu botolnya ditawarkan dengan harga mulai Rp16.500."));
        listmenu.add(new Air(R.drawable.evian, "Evian", "ini adalah air mineral kemasan Evian. \n Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman."));


        //membuat adapter yang mengubungkan kelas ini dengan data yang ditampilkan
        adapter = new Adapter(this, listmenu);

        //menghubungkan recyclerview dengan adapter
        rv.setAdapter(adapter);
    }
}

