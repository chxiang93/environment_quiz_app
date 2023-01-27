package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_page extends AppCompatActivity implements View.OnClickListener{

    private Button btnPlay, btnAboutUs, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.play);
        btnAboutUs = findViewById(R.id.about);
        btnExit = findViewById(R.id.exit);

        btnPlay.setOnClickListener(this);
        btnAboutUs.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view.getId() == R.id.play) {
            // Construct Java solution to open the play activity
            Intent intent = new Intent(getBaseContext(), play_page.class);
            startActivity(intent);
        } else if (view.getId() == R.id.about) {
            // Construct Java solution to open the about us activity
            Intent intent = new Intent(getBaseContext(), about_us_page.class);
            startActivity(intent);
        } else if (view.getId() == R.id.exit) {
            // Construct Java solution to exit activity

        }
    }
}