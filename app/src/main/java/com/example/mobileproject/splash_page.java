package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash_page extends AppCompatActivity {
    private ImageView app_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        app_name = findViewById(R.id.app_name);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.myanim);
        app_name.setAnimation(anim);

        new Thread() {

            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent intent = new Intent(getBaseContext(), home_page.class);
                startActivity(intent);
                splash_page.this.finish();
            }
        }.start();

    }
}