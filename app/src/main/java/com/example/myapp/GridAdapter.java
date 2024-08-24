package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GridAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public GridAdapter(Context context, String[] values) {
        super(context, R.layout.grid_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView = inflater.inflate(R.layout.grid_item, parent, false);
        TextView textView = gridView.findViewById(R.id.grid_item_text);
        textView.setText(values[position]);
        return gridView;
    }
}
