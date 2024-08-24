package com.example.myapp;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StudentListActivity extends Activity {
    private ListView listView;
    private StudentDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        dbHelper = new StudentDatabaseHelper(this);
        listView = findViewById(R.id.listView);

        Cursor cursor = dbHelper.getReadableDatabase().query("students", null, null, null, null, null, null);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        while (cursor.moveToNext()) {
            adapter.add(cursor.getString(1));
        }
        cursor.close();
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(StudentListActivity.this, AddEditStudentActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });
    }

    public void addStudent(View view) {
        Intent intent = new Intent(this, AddEditStudentActivity.class);
        startActivity(intent);
    }
}