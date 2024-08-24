package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivityq5 extends AppCompatActivity {

    private TextView displayMessage;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q5second);

        displayMessage = findViewById(R.id.display_message);
        returnButton = findViewById(R.id.button_return);

        // Get the message passed from MainActivity
        String message = getIntent().getStringExtra("message_key");
        displayMessage.setText(message);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("return_key", "Message Received and Returned!");
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
