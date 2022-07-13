package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.net.IDN;

public class MainActivity extends AppCompatActivity {
    private String[] data = {"A", "B","C", "D", "E", "F", "G", "H", "I", "J", "K", "A", "B","C", "D", "E", "F", "G","A", "B","C", "D", "E", "F", "G", "H", "I", "J", "K"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        ListView list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(adapter);

    }
}
class Adapter extends ArrayAdapter<String>{
    private int id;

    public Adapter(@NonNull Context context, int resourceId, @NonNull String[] objects) {
        super(context, resourceId, objects);
        id = resourceId;
    }


}