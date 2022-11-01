package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerangkatTertautActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perangkat_tertaut);

        Button btntautanActivity = findViewById(R.id.btn_tautan_perangkat);
        btntautanActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_tautan_perangkat) {
            Intent tautanIntent = new Intent(PerangkatTertautActivity.this, SuccessTautanActivity.class);
            startActivity(tautanIntent);
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}