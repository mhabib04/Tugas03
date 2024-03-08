package com.example.tugas03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FishActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);

        ImageView imgFishCupang = findViewById(R.id.imgFishCupang);
        ImageView imgFishDiscus = findViewById(R.id.imgFishDiscus);
        ImageView imgFishGuppy = findViewById(R.id.imgFishGuppy);
        ImageView imgFishKoi = findViewById(R.id.imgFishKoi);
        ImageView imgFishMoorish = findViewById(R.id.imgFishMoorishIdol);
        Button btnFishCupang = findViewById(R.id.btnFishCupang);
        Button btnFishDiscus = findViewById(R.id.btnFishDiscus);
        Button btnFishGuppy = findViewById(R.id.btnFishGuppy);
        Button btnFishKoi = findViewById(R.id.btnFishKoi);
        Button btnFishMoorish = findViewById(R.id.btnFishMoorishIdol);

        imgFishCupang.setOnClickListener(this);
        imgFishDiscus.setOnClickListener(this);
        imgFishGuppy.setOnClickListener(this);
        imgFishKoi.setOnClickListener(this);
        imgFishMoorish.setOnClickListener(this);
        btnFishCupang.setOnClickListener(this);
        btnFishDiscus.setOnClickListener(this);
        btnFishGuppy.setOnClickListener(this);
        btnFishKoi.setOnClickListener(this);
        btnFishMoorish.setOnClickListener(this);

    }

    Detail detail = new Detail();
    Intent intent;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgFishCupang || v.getId() == R.id.btnFishCupang){
            detail.setJenis("Jenis Ikan : Cupang\n");
            detail.setUmur("Berumur : 5 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : -\n");
            detail.setWarna("Berwarna Merah\n");
            detail.setHarga("Harga : Rp255.000");
            detail.setGambar("fish_cupang");
            intent = new Intent(FishActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgFishDiscus || v.getId() == R.id.btnFishDiscus) {
            detail.setJenis("Jenis Ikan : Discus\n");
            detail.setUmur("Berumur : 8 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : -\n");
            detail.setWarna("Berwarna Orange\n");
            detail.setHarga("Harga : Rp430.000");
            detail.setGambar("fish_discus");
            intent = new Intent(FishActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgFishGuppy || v.getId() == R.id.btnFishGuppy) {
            detail.setJenis("Jenis Ikan : Guppy\n");
            detail.setUmur("Berumur : 6 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : -\n");
            detail.setWarna("Berwarna Hijau\n");
            detail.setHarga("Harga : Rp360.000");
            detail.setGambar("fish_guppy");
            intent = new Intent(FishActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgFishKoi || v.getId() == R.id.btnFishKoi) {
            detail.setJenis("Jenis Ikan : Koi\n");
            detail.setUmur("Berumur : 5 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : -\n");
            detail.setWarna("Berwarna Putih-Orang-Hitam(Mix)\n");
            detail.setHarga("Harga : Rp250.000");
            detail.setGambar("fish_koi");
            intent = new Intent(FishActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgFishMoorishIdol || v.getId() == R.id.btnFishMoorishIdol) {
            detail.setJenis("Jenis Ikan : Moorish Idol\n");
            detail.setUmur("Berumur : 10 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : -\n");
            detail.setWarna("Berwarna Orange\n");
            detail.setHarga("Harga : Rp470.000");
            detail.setGambar("fish_moorish_idol");
            intent = new Intent(FishActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}