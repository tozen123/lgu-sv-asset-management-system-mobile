package com.doublehammerstudios.lgu_svassetmanagementsystemmobile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button startButton = findViewById(R.id.scanButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch ScanActivity when the button is clicked
                startActivity(new Intent(SecondActivity.this, ScanActivity.class));
            }
        });
    }
}
