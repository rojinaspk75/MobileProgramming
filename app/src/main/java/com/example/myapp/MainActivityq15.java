package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivityq15 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_q15);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerAdapter adapter = new RecyclerAdapter(items);
        recyclerView.setAdapter(adapter);

//        adapter.setOnItemClickListener(position -> {
//            String selectedItem = items[position];
//            Toast.makeText(MainActivityq15.this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
//        });
    }
}
