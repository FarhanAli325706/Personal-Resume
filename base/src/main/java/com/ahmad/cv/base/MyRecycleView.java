package com.ahmad.cv.base;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.util.LinkedList;

public class MyRecycleView extends AppCompatActivity {
    private final LinkedList<String> skillsList=new LinkedList<String>();
    private RecyclerView myRecyclerView;
    private myAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycle_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Skills");

        skillsList.add("Android");
        skillsList.add("Java");
        skillsList.add("Web Development");
        skillsList.add("PHP");
        skillsList.add("Java Script");
        skillsList.add("C++");
        skillsList.add("C");
        skillsList.add("SQL");
        skillsList.add("Assembly");
        skillsList.add("Python");
        // Get a handle to the RecyclerView.
        myRecyclerView = findViewById(R.id.myRecycleView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new myAdapter(this, skillsList);
        // Connect the adapter with the RecyclerView.
        myRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      this.finish();
      return true;
    }
}
