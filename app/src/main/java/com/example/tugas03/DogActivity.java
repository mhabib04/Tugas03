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

public class DogActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        ImageView imgDogBeagle  = findViewById(R.id.imgDogBeagle);
        ImageView imgDogBorderCollie = findViewById(R.id.imgDogBorderCollie);
        ImageView imgDogBulldog = findViewById(R.id.imgDogBulldog);
        ImageView imgDogCorgi = findViewById(R.id.imgDogCorgi);
        ImageView imgDogPomeranian = findViewById(R.id.imgDogPomeranian);

        Button btnDogBeagle = findViewById(R.id.btnDogBeagle);
        Button btnDogBorderCollie = findViewById(R.id.btnDogBorderCollie);
        Button btnDogBulldog = findViewById(R.id.btnDogBulldog);
        Button btnDogCorgi = findViewById(R.id.btnDogCorgi);
        Button btnDogPomeranian = findViewById(R.id.btnDogPomeranian);

        imgDogBeagle.setOnClickListener(this);
        imgDogBorderCollie.setOnClickListener(this);
        imgDogBulldog.setOnClickListener(this);
        imgDogCorgi.setOnClickListener(this);
        imgDogPomeranian.setOnClickListener(this);
        btnDogBeagle.setOnClickListener(this);
        btnDogBorderCollie.setOnClickListener(this);
        btnDogBulldog.setOnClickListener(this);
        btnDogCorgi.setOnClickListener(this);
        btnDogPomeranian.setOnClickListener(this);

    }

    Detail detail = new Detail();
    Intent intent;
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgDogBeagle || v.getId() == R.id.btnDogBeagle){
            detail.setJenis("Jenis Anjing : Beagle\n");
            detail.setUmur("Berumur : 1 tahun 8 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Jantan\n");
            detail.setWarna("Berwarna Coklat-Putih\n");
            detail.setHarga("Harga : Rp1.250.000");
            detail.setGambar("dog_beagle");
            intent = new Intent(DogActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgDogBorderCollie || v.getId() == R.id.btnDogBorderCollie) {
            detail.setJenis("Jenis Anjing : Border Collie\n");
            detail.setUmur("Berumur : 1 tahun 10 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Jantan\n");
            detail.setWarna("Berwarna Hitam-Putih\n");
            detail.setHarga("Harga : Rp1.350.000");
            detail.setGambar("dog_border_collie");
            intent = new Intent(DogActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }  else if (v.getId() == R.id.imgDogBulldog || v.getId() == R.id.btnDogBulldog) {
            detail.setJenis("Jenis Anjing : Bulldog\n");
            detail.setUmur("Berumur : 1 tahun 6 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Jantan\n");
            detail.setWarna("Berwarna Coklat-Putih\n");
            detail.setHarga("Harga : Rp1.600.000");
            detail.setGambar("dog_bulldog");
            intent = new Intent(DogActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }  else if (v.getId() == R.id.imgDogCorgi || v.getId() == R.id.btnDogCorgi) {
            detail.setJenis("Jenis Anjing : Corgi\n");
            detail.setUmur("Berumur : 1 tahun 5 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Jantan\n");
            detail.setWarna("Berwarna Coklat-Putih\n");
            detail.setHarga("Harga : Rp1.450.000");
            detail.setGambar("dog_corgi");
            intent = new Intent(DogActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }  else if (v.getId() == R.id.imgDogPomeranian || v.getId() == R.id.btnDogPomeranian) {
            detail.setJenis("Jenis Anjing : Pomeranian\n");
            detail.setUmur("Berumur : 1 tahun 3 bulan\n");
            detail.setJenisKelamin("Jenis Kelamin : Betina\n");
            detail.setWarna("Berwarna Coklat\n");
            detail.setHarga("Harga : Rp1.770.000");
            detail.setGambar("dog_pomeranian");
            intent = new Intent(DogActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}