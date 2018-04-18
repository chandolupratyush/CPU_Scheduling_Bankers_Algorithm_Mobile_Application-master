package com.example.android.cpuscheduling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
	import android.view.View;
	import android.widget.EditText;
	import android.widget.TextView;
     import java.lang.reflect.Array;
	import pl.droidsonroids.gif.BuildConfig;

public class Deadlock extends AppCompatActivity {
	/*
	int[][] a = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{4, 3}));
	int[][] b = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{4, 3}));
	int[] c = new int[3];
	int[][] need = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{4, 3}));
      	protected void onCreate(Bundle savedInstanceState) {
       	super.onCreate(savedInstanceState);
        	setContentView(R.layout.activity_deadlock);
        	}

      public void submit(View view) {
        	int i;
        	int j;
       	    EditText a2 = (EditText) findViewById(R.id.e2);
        	EditText a3 = (EditText) findViewById(R.id.e3);
       	    EditText a4 = (EditText) findViewById(R.id.e4);
        	EditText a5 = (EditText) findViewById(R.id.e5);
        	EditText a6 = (EditText) findViewById(R.id.e6);
        	EditText a7 = (EditText) findViewById(R.id.e7);
        	EditText a8 = (EditText) findViewById(R.id.e8);
        	EditText a9 = (EditText) findViewById(R.id.e9);
        	EditText a10 = (EditText) findViewById(R.id.e10);
        	EditText a11 = (EditText) findViewById(R.id.e11);
        	EditText a12 = (EditText) findViewById(R.id.e12);
        	EditText a13 = (EditText) findViewById(R.id.e13);
            EditText a14 = (EditText) findViewById(R.id.e14);
       	    EditText a15 = (EditText) findViewById(R.id.e15);
        	EditText a16 = (EditText) findViewById(R.id.e16);
        	EditText a17 = (EditText) findViewById(R.id.e17);
        	EditText a18 = (EditText) findViewById(R.id.e18);
       	     EditText a19 = (EditText) findViewById(R.id.e19);
        	EditText a20 = (EditText) findViewById(R.id.e20);
        	EditText a21 = (EditText) findViewById(R.id.e21);
        	EditText a22 = (EditText) findViewById(R.id.e22);
            EditText a23 = (EditText) findViewById(R.id.e23);
        	EditText a24 = (EditText) findViewById(R.id.e24);
        	EditText a25 = (EditText) findViewById(R.id.e25);
        	EditText a26 = (EditText) findViewById(R.id.e26);
        	EditText a27 = (EditText) findViewById(R.id.e27);

        	this.a[0][0] = Integer.valueOf(((EditText) findViewById(R.id.e1)).getText().toString()).intValue();
        	this.a[0][1] = Integer.valueOf(a2.getText().toString()).intValue();
        	this.a[0][2] = Integer.valueOf(a3.getText().toString()).intValue();
        	this.a[1][0] = Integer.valueOf(a4.getText().toString()).intValue();
        	this.a[1][1] = Integer.valueOf(a5.getText().toString()).intValue();
        	this.a[1][2] = Integer.valueOf(a6.getText().toString()).intValue();
        	this.a[2][0] = Integer.valueOf(a7.getText().toString()).intValue();
        	this.a[2][1] = Integer.valueOf(a8.getText().toString()).intValue();
        	this.a[2][2] = Integer.valueOf(a9.getText().toString()).intValue();
            this.a[3][0] = Integer.valueOf(a10.getText().toString()).intValue();
        	this.a[3][1] = Integer.valueOf(a11.getText().toString()).intValue();
       	    this.a[3][2] = Integer.valueOf(a12.getText().toString()).intValue();
        	this.b[0][0] = Integer.valueOf(a13.getText().toString()).intValue();
       	this.b[0][1] = Integer.valueOf(a14.getText().toString()).intValue();
      	this.b[0][2] = Integer.valueOf(a15.getText().toString()).intValue();
        	this.b[1][0] = Integer.valueOf(a16.getText().toString()).intValue();
        this.b[1][1] = Integer.valueOf(a17.getText().toString()).intValue();
        	this.b[1][2] = Integer.valueOf(a18.getText().toString()).intValue();
       	this.b[2][0] = Integer.valueOf(a19.getText().toString()).intValue();
       this.b[2][1] = Integer.valueOf(a20.getText().toString()).intValue();
        this.b[2][2] = Integer.valueOf(a21.getText().toString()).intValue();
      	this.b[3][0] = Integer.valueOf(a22.getText().toString()).intValue();
        	this.b[3][1] = Integer.valueOf(a23.getText().toString()).intValue();
        	this.b[3][2] = Integer.valueOf(a24.getText().toString()).intValue();
        	this.c[0] = Integer.valueOf(a25.getText().toString()).intValue();
        	this.c[1] = Integer.valueOf(a26.getText().toString()).intValue();
        	this.c[2] = Integer.valueOf(a27.getText().toString()).intValue();
        	TextView myText = (TextView) findViewById(R.id.deadlock1);
        	TextView myText1 = (TextView) findViewById(R.id.deadlock2);
       	TextView myText2 = (TextView) findViewById(R.id.deadlock3);
       	int[] p = new int[4];
        	String abc = BuildConfig.VERSION_NAME;
       	myText1.setText(BuildConfig.VERSION_NAME);
        	myText2.setText(BuildConfig.VERSION_NAME);
       	for (i = 0; i < 4; i++) {
          p[i] = 0;
            }
        	for (i = 0; i < 4; i++) {
          	for (j = 0; j < 3; j++) {
               	this.need[i][j] = this.b[i][j] - this.a[i][j];
                	}
            	}
       for (int k = 0; k < 4; k++) {
            i = 0;
            while (i < 4) {
                	j = 0;
                while (j < 3 && (this.need[i][j] <= this.c[j] || this.need[i][j] <= 0)) {
                   	j++;
                    }
               if (j == 3) {
                    if (p[i] == 0) {
                        p[i] = i + 1;
                        abc = ((abc + "P") + Integer.toString(p[i])) + " ";
                        }
                    for (j = 0; j < 3; j++) {
                        int[] iArr = this.c;
                        iArr[j] = iArr[j] + this.a[i][j];
                        this.need[i][j] = 0;
                        }
                    }
                i++;
              }
            }
        i = 0;
        while (i < 4) {
            if (p[i] == 0) {
               myText.setText("*UNSAFE STATE*");
                break;
                }
            i++;
            }
        if (i == 4) {
            myText.setText("*SAFE STATE*");
            myText1.setText("Safe Sequence is: -");
            myText2.setText(abc);
            }
        }
}
*/
}