package com.ahmad.cv.base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;

public class MyRecycleView extends AppCompatActivity {
    private final LinkedList<String> skillsList=new LinkedList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycle_view);
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
    }
}
