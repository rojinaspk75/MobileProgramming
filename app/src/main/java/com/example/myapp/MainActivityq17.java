package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityq17 extends AppCompatActivity {

    private EditText principalEditText;
    private EditText rateEditText;
    private EditText timeEditText;
    private TextView resultTextView;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_q17);

        principalEditText = findViewById(R.id.principal);
        rateEditText = findViewById(R.id.rate);
        timeEditText = findViewById(R.id.time);
        resultTextView = findViewById(R.id.result);
        calculateButton = findViewById(R.id.calculate);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSimpleInterest();
            }
        });
    }

    private void calculateSimpleInterest() {
        try {
            double principal = Double.parseDouble(principalEditText.getText().toString());
            double rate = Double.parseDouble(rateEditText.getText().toString());
            double time = Double.parseDouble(timeEditText.getText().toString());

            double simpleInterest = (principal * rate * time) / 100;
            resultTextView.setText("Simple Interest: " + simpleInterest);
        } catch (NumberFormatException e) {
            resultTextView.setText("Please enter valid numbers");
        }
    }
}
