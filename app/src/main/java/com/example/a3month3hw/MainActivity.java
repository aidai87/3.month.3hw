package com.example.a3month3hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> age = new ArrayList<>();
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecycler();
    }

    private void initData() {
        names.add("Katya");
        age.add("12");
        names.add("Katya");
        age.add("14");
        names.add("Katya");
        age.add("15");
        names.add("Katya");
        age.add("16");
        names.add("Katya");
        age.add("18");
        names.add("Katya");
        age.add("19");
        names.add("Katya");
        age.add("22");
        names.add("Katya");
        age.add("24");
        names.add("Katya");
        age.add("25");
        names.add("Katya");
        age.add("26");

    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recycler);
        adapter = new MainAdapter(names, age);
        recyclerView.setAdapter(adapter);
    }
}