package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
//        Intent intent = new Intent(getBaseContext(), home_page.class);
//        startActivity(intent);
        finish();
    }

}