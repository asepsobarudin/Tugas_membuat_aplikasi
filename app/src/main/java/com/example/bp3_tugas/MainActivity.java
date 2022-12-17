package com.example.bp3_tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button btnTI = findViewById(R.id.teknik_informatika);
        btnTI.setOnClickListener(this);

        Button btnSI = findViewById(R.id.sistem_informasi);
        btnSI.setOnClickListener(this);

        Button btnMI = findViewById(R.id.manajement_informatika);
        btnMI.setOnClickListener(this);

        Button btnTI3 = findViewById(R.id.teknik_informatika_d3);
        btnTI3.setOnClickListener(this);

        Button btnDKV = findViewById(R.id.desain_komunikasi_visual);
        btnDKV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.teknik_informatika:
                Intent moveTI = new Intent(MainActivity.this, teknik_informatika_s1.class);
                startActivity(moveTI);
                break;
            case R.id.sistem_informasi:
                Intent moveSI = new Intent(MainActivity.this, sistem_informasi_s1.class);
                startActivity(moveSI);
                break;
            case R.id.manajement_informatika:
                Intent moveMI = new Intent(MainActivity.this, manajement_informatika.class);
                startActivity(moveMI);
                break;

            case R.id.teknik_informatika_d3:
                Intent moveTI3 = new Intent(MainActivity.this, teknik_informatika_d3.class);
                startActivity(moveTI3);
                break;

            case R.id.desain_komunikasi_visual:
                Intent moveDKV = new Intent(MainActivity.this, desain_komunikasi_visual.class);
                startActivity(moveDKV);
                break;
        }
    }
}