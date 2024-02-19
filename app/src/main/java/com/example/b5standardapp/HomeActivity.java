package com.example.b5standardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    //lateinit var tvMessage:TextView
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvData  = findViewById(R.id.tvData);

        String data = getIntent().getStringExtra("nkey");
        tvData.setText(data);
    }
}