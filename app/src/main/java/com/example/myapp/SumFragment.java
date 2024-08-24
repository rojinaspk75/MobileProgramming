package com.example.myapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class SumFragment extends Fragment {

    private EditText inputNumber;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);

        inputNumber = view.findViewById(R.id.input_number);
        calculateButton = view.findViewById(R.id.calculate_button);
        resultTextView = view.findViewById(R.id.result_text_view);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputNumber.getText().toString();
                if (!input.isEmpty()) {
                    int n = Integer.parseInt(input);
                    int sum = calculateSum(n);
                    resultTextView.setText("Sum: " + sum);
                }
            }
        });

        return view;
    }

    private int calculateSum(int n) {
        return n * (n + 1) / 2;
    }
}
