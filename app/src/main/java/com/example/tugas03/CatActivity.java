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

public class CatActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        ImageView imgCatPersia = findViewById(R.id.imgCatPersia);
        ImageView imgCatBritishShorthair = findViewById(R.id.imgCatBritishShorthair);
        ImageView imgCatRagdoll = findViewById(R.id.imgCatRagdoll);
        ImageView imgCatSphynx = findViewById(R.id.imgCatSphynx);
        ImageView imgCatBengal = findViewById(R.id.imgCatBengal);

        Button btnCatPersia = findViewById(R.id.btnCatPersia);
        Button btnCatBritishShortHair = findViewById(R.id.btnCatBritishShortHair);
        Button btnCatRagdoll = findViewById(R.id.btnCatRagdoll);
        Button btnCatSphynx = findViewById(R.id.btnCatSphynx);
        Button btnCatBengal = findViewById(R.id.btnCatBengal);

        imgCatPersia.setOnClickListener(this);
        imgCatBritishShorthair.setOnClickListener(this);
        imgCatRagdoll.setOnClickListener(this);
        imgCatSphynx.setOnClickListener(this);
        imgCatBengal.setOnClickListener(this);
        btnCatPersia.setOnClickListener(this);
        btnCatBritishShortHair.setOnClickListener(this);
        btnCatRagdoll.setOnClickListener(this);
        btnCatSphynx.setOnClickListener(this);
        btnCatBengal.setOnClickListener(this);

    }
    Detail detail = new Detail();
    Intent intent;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgCatPersia || v.getId() == R.id.btnCatPersia){
            detail.setJenis("Jenis Kucing : Persia\n");
            detail.setUmur("Berumur : 1 tahun 3 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Jantan\n");
            detail.setWarna("Berwarna Putih\n");
            detail.setHarga("Harga : Rp1.450.000");
            detail.setGambar("cat_persia");
            intent = new Intent(CatActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCatBritishShorthair || v.getId() == R.id.btnCatBritishShortHair) {
            detail.setJenis("Jenis Kucing : British Shorthair\n");
            detail.setUmur("Berumur : 1 tahun 1 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Betina\n");
            detail.setWarna("Berwarna Abu-abu\n");
            detail.setHarga("Harga : Rp1.250.000");
            detail.setGambar("cat_british_shorthair");
            intent = new Intent(CatActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCatRagdoll || v.getId() == R.id.btnCatRagdoll) {
            detail.setJenis("Jenis Kucing : Ragdoll\n");
            detail.setUmur("Berumur : 1 tahun 4 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Jantan\n");
            detail.setWarna("Berwarna Putih Mix Coklat-Hitam\n");
            detail.setHarga("Harga : Rp1.650.000");
            detail.setGambar("cat_ragdoll");
            intent = new Intent(CatActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCatSphynx || v.getId() == R.id.btnCatSphynx) {
            detail.setJenis("Jenis Kucing : Sphynx\n");
            detail.setUmur("Berumur : 1 tahun 6 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Betina\n");
            detail.setWarna("Berwarna Orange Kulit\n");
            detail.setHarga("Harga : Rp1.500.000");
            detail.setGambar("cat_sphynx");
            intent = new Intent(CatActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCatBengal || v.getId() == R.id.btnCatBengal) {
            detail.setJenis("Jenis Kucing : Bengal\n");
            detail.setUmur("Berumur : 1 tahun 2 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Jantan\n");
            detail.setWarna("Berwarna Orange\n");
            detail.setHarga("Harga : Rp1.770.000");
            detail.setGambar("cat_bengal");
            intent = new Intent(CatActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}