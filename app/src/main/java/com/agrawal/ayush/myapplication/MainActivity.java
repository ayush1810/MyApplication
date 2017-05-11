package com.agrawal.ayush.myapplication;

import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items;
    ArrayAdapter<String> itemAdapter;
   RecyclerView viewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewList = (RecyclerView) findViewById(R.id.viewList);
        itemAdapter= new ArrayAdapter<String>(this, android.R.layout.listItem1, items);
        viewList.setAdapter(itemAdapter);
        items = new ArrayList<>();
        items.add("First Note");
        items.add("Second that!");

    }
}
