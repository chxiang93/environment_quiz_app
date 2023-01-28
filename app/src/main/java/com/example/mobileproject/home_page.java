package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Group 22
// Group Members:
// 1) Poh Soon Heng B0321010010
// 2) Beh Kar Soon B032010466
// 3) Sue Chen Xiang B032010034

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
            finish();
        } else if (view.getId() == R.id.about) {
            // Construct Java solution to open the about us activity
            Intent intent = new Intent(getBaseContext(), about_us_page.class);
            startActivity(intent);
        } else if (view.getId() == R.id.exit) {
            // Construct Java solution to exit activity

            // Create the object of AlertDialog Builder class
            AlertDialog.Builder builder = new AlertDialog.Builder(home_page.this);

            // Set the message show for the Alert
            builder.setMessage("Do you want to exit?");

            // Set Alert title
            builder.setTitle("Exit");

            // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
            builder.setCancelable(false);

            // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
            builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                // When the user click yes button then app will close
                finish();
                System.exit(0);
            });

            // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
            builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                dialog.cancel();
            });

            // Create the Alert dialog
            AlertDialog alertDialog = builder.create();
            // Show the Alert Dialog box
            alertDialog.show();
        }
    }
}