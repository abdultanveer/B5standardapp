package com.example.b5standardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    //lateinit var tvMessage:TextView
    TextView tvData;
public static String TAG = HomeActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvData  = findViewById(R.id.tvData);

        String data = getIntent().getStringExtra("nkey");
        tvData.setText(data);
        Log.i(TAG,"created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"started -visible");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"resumed -restore game state");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"paused -- save data");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"destroyed");
    }
}