package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Group 22
// Group Members:
// 1) Poh Soon Heng B0321010010
// 2) Beh Kar Soon B032010466
// 3) Sue Chen Xiang B032010034

public class about_us_page extends AppCompatActivity implements View.OnClickListener{

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_page);

        btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(this);
    }

    public void onClick(View view){
        finish();
    }

}