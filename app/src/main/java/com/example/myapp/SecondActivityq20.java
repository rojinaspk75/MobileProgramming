package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivityq20 extends AppCompatActivity {

    private TextView receivedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_q20);

        receivedTextView = findViewById(R.id.receivedTextView);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        receivedTextView.setText(message);
    }
}
