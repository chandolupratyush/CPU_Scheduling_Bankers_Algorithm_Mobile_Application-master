package com.example.android.cpuscheduling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void gotodeadlock(View view){
        Intent intent=new Intent(this,Deadlock.class);
        startActivity(intent);
    }
    public void gotoscheduling(View view){
        Intent intent=new Intent(this,Scheduling.class);
        startActivity(intent);
    }
}
