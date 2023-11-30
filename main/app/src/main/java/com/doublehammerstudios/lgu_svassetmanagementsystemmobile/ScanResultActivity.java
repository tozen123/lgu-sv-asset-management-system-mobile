package com.doublehammerstudios.lgu_svassetmanagementsystemmobile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScanResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_result);

        // Retrieve scanned data from the intent
        String scannedData = getIntent().getStringExtra("SCANNED_DATA");

        // Find views in the layout
        TextView scanResultLabel = findViewById(R.id.scanAssetLabel);
        Button viewButton = findViewById(R.id.viewButton);

        // Update UI with the scanned data
        scanResultLabel.setText(scannedData);

        // Implement your logic for viewButton click or other actions
        // For example:
        viewButton.setOnClickListener(v -> {
            // Perform an action when the viewButton is clicked
            // You can navigate to another activity or perform other actions here
        });
    }
}
