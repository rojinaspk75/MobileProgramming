package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityq18 extends AppCompatActivity {

    private EditText numberEditText;
    private TextView resultTextView;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_q18);

        numberEditText = findViewById(R.id.number);
        resultTextView = findViewById(R.id.result);
        calculateButton = findViewById(R.id.calculate);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateFactorial();
            }
        });
    }

    private void calculateFactorial() {
        try {
            int number = Integer.parseInt(numberEditText.getText().toString());

            if (number < 0) {
                resultTextView.setText("Please enter a non-negative number");
                return;
            }

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            resultTextView.setText("Factorial: " + factorial);
        } catch (NumberFormatException e) {
            resultTextView.setText("Please enter a valid number");
        }
    }
}
