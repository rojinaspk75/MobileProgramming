package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityq13 extends AppCompatActivity {

    private ListView listView;
    private String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_q13);

        listView = findViewById(R.id.list_view);

        // Use the custom adapter
        CustomAdapter adapter = new CustomAdapter(this, items);
        listView.setAdapter(adapter);

        // Set an item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = items[position];
                Toast.makeText(MainActivityq13.this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
