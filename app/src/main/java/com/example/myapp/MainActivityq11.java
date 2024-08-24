package com.example.myapp;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityq11 extends AppCompatActivity {

    private Button showPopupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_q11);

        showPopupButton = findViewById(R.id.show_popup_button);

        showPopupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
    }

    private void showPopupMenu(View view) {
        // Create a PopupMenu
        PopupMenu popupMenu = new PopupMenu(this, view);
        // Inflate the menu resource file
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popupMenu.getMenu());

        // Set a click listener for menu items
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_option1:
                        Toast.makeText(MainActivityq11.this, "Option 1 selected", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_option2:
                        Toast.makeText(MainActivityq11.this, "Option 2 selected", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_option3:
                        Toast.makeText(MainActivityq11.this, "Option 3 selected", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });

        // Show the popup menu
        popupMenu.show();
    }
}
