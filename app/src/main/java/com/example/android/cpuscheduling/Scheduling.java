package com.example.android.cpuscheduling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Scheduling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduling);
    }
    public void gotofcfs(View view){
        Intent intent=new Intent(this,Fcfs.class);
        startActivity(intent);
    }
    public void gotosjf(View view){
        Intent intent=new Intent(this,Sjf.class);
        startActivity(intent);
    }
    public void gotosrtf(View view){
        Intent intent=new Intent(this,Srtf.class);
        startActivity(intent);
    }
    public void gotolrtf(View view){
        Intent intent=new Intent(this,Lrtf.class);
        startActivity(intent);
    }
    public void gotopp(View view){
        Intent intent=new Intent(this,Pp.class);
        startActivity(intent);
    }
    public void gotorr(View view){
        Intent intent=new Intent(this,Roundrobin.class);
        startActivity(intent);
    }
    public void gotopnp(View view){
        Intent intent=new Intent(this,pnp.class);
        startActivity(intent);
    }
}
