package com.example.bp3_tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class desain_komunikasi_visual extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desain_komunikasi_visual);

        setContentView(R.layout.activity_teknik_informatika_d3);

        getSupportActionBar().hide();

        Button back = findViewById(R.id.back);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                Intent btnBack = new Intent(desain_komunikasi_visual.this, MainActivity.class);
                startActivity(btnBack);
                break;
        }
    }
}