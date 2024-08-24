package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityq19 extends AppCompatActivity {

    private EditText numberEditText;
    private TextView resultTextView;
    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_q19);

        numberEditText = findViewById(R.id.number);
        resultTextView = findViewById(R.id.result);
        checkButton = findViewById(R.id.check);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPrime();
            }
        });
    }

    private void checkPrime() {
        try {
            int number = Integer.parseInt(numberEditText.getText().toString());

            if (number <= 1) {
                resultTextView.setText("Enter a number greater than 1");
                return;
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                resultTextView.setText(number + " is a Prime Number");
            } else {
                resultTextView.setText(number + " is a Composite Number");
            }
        } catch (NumberFormatException e) {
            resultTextView.setText("Please enter a valid number");
        }
    }
}
