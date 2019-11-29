package com.example.muhtamimnahid.leadinguniversitybus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class ScheduleActivity extends AppCompatActivity {


    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        toolbar = (Toolbar)findViewById(R.id.driverToolbar);
        toolbar.setTitle("LUBus Schedule");
        setSupportActionBar(toolbar);


    }
}
