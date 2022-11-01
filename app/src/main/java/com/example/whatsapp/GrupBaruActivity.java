package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GrupBaruActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grup_baru);

        Button btnBuatGrupActivity = findViewById(R.id.btn_buat_grup);
        btnBuatGrupActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view.getId()== R.id.btn_buat_grup){
            Intent buatGrupIntent = new Intent(GrupBaruActivity.this, SuccessGrupActivity.class);
            startActivity(buatGrupIntent);
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}