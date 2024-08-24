package com.example.myapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityq7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_q7);

        if (savedInstanceState == null) {
            // Add the fragment to the activity
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new SumFragment())
                    .commit();
        }
    }
}
