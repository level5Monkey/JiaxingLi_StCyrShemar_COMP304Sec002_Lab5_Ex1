package com.example.jiaxingli_stcyrshemar_comp304sec002_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview1);
        ArrayList<String> resturantTypes = new ArrayList<>();
        resturantTypes.add("Italian");
        resturantTypes.add("Greek");
        resturantTypes.add("Chinese");
        resturantTypes.add("Indian");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                resturantTypes );

        listView.setAdapter(arrayAdapter);


    }
}