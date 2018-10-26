package com.demo.song.behavior;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.demo.song.adpater.DemoRecylerViewAdapter;
import com.demo.song.demoset.R;

public class BehaviorActivity5 extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior5);
        recyclerView= findViewById(R.id.my_list);
        DemoRecylerViewAdapter.mockData(recyclerView);
    }
}