package com.example.myapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityq6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        if (savedInstanceState == null) {
            // Add the fragments to the layout
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container1, new Fragment1())
                    .replace(R.id.fragment_container2, new Fragment2())
                    .commit();
        }
    }
}
