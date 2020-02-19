package com.e.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 12);

        recyclerViewAdapter = new RecyclerViewAdapter(this, getDate());

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setScrollingTouchSlop(View.FOCUSABLES_TOUCH_MODE);

    }

    private ArrayList<String> getDate() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            strings.add(i + "");
        }
        return strings;
    }
}