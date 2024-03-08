package com.example.tugas03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgCat = findViewById(R.id.imgCat);
        ImageView imgDog = findViewById(R.id.imgDog);
        ImageView imgFish = findViewById(R.id.imgFish);
        Button btnCat = findViewById(R.id.btnCat);
        Button btnDog = findViewById(R.id.btnDog);
        Button btnFish = findViewById(R.id.btnFish);

        imgCat.setOnClickListener(this);
        imgDog.setOnClickListener(this);
        imgFish.setOnClickListener(this);
        btnCat.setOnClickListener(this);
        btnDog.setOnClickListener(this);
        btnFish.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgCat || v.getId() == R.id.btnCat){
            Intent intent = new Intent(this, CatActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imgDog || v.getId() == R.id.btnDog) {
            Intent intent = new Intent(this, DogActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imgFish || v.getId() == R.id.btnFish) {
            Intent intent = new Intent(this, FishActivity.class);
            startActivity(intent);
        }
    }
}