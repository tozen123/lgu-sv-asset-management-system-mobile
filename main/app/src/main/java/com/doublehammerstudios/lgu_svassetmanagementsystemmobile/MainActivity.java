package com.doublehammerstudios.lgu_svassetmanagementsystemmobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Duration of the splash screen in milliseconds
    private static final int SPLASH_SCREEN_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Use a Handler to delay the transition to the SecondActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start SecondActivity after the splash screen duration
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                finish(); // Finish MainActivity to prevent going back to it
            }
        }, SPLASH_SCREEN_DURATION);
    }
}
