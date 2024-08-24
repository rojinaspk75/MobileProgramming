package com.example.myapp;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityq14 extends AppCompatActivity {

    private GridView gridView;
    private String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_q14);

        gridView = findViewById(R.id.grid_view);
        GridAdapter adapter = new GridAdapter(this, items);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = items[position];
            Toast.makeText(MainActivityq14.this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
        });
    }
}
