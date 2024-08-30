package com.example.onclickhandling;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        editTextName = findViewById(R.id.editTextName);
        editTextAddress = findViewById(R.id.editTextAddress);
    }

    // Method to handle button click
    public void onSubmitClick(View view) {
        // Get input values
        String name = editTextName.getText().toString();
        String address = editTextAddress.getText().toString();

        // Show toast message with input values
        String message = "Name: " + name + "\nAddress: " + address;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}