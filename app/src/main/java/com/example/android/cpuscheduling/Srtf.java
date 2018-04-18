package com.example.android.cpuscheduling;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.cpuscheduling.R.layout.add_fcfs;
import static java.sql.Types.NULL;

public class Srtf extends AppCompatActivity {
    int count = 0;
    int a[] = new int[10];
    int b[] = new int[10];
    private TextView myText = null;
    private Button buttonClick;
    private Button deletebutton;
    private Button resetbutton;
    private Button computebutton;
    public Dialog dialog =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srtf);
        TextView myText = (TextView) findViewById(R.id.textview1srtf);
        myText.append("P[i]\t\tbt\t\tat\n\n");
        buttonClick = (Button) findViewById(R.id.buttonClick);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create custom dialog object
                dialog = new Dialog(Srtf.this);
                // Include dialog.xml file
                dialog.setContentView(add_fcfs);
                // Set dialog title
                dialog.setTitle("Custom Dialog");
                // set values for custom dialog components - text, image and button
                dialog.show();
                Button save = (Button) dialog.findViewById(R.id.save);
                save.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        check();
                        dialog.dismiss();
                    }
                });
                deletebutton = (Button) findViewById(R.id.delete);
                deletebutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        a[count]=NULL;
                        b[count]=NULL;

                        count--;
                        Context context = getApplicationContext();
                        CharSequence text = "Last process is deleted";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                });
                resetbutton = (Button) findViewById(R.id.reset);
                resetbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int i;
                        for(i=0;i<count;i++){
                            a[i]=NULL;
                            b[i]=NULL;
                        }
                        count=0;

                        TextView myText = (TextView) findViewById(R.id.textview1srtf);
                        myText.setText("P[i]\t\tbt\t\tat\n"+"\n");
                    }
                });

                computebutton = (Button) findViewById(R.id.compute);
                computebutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //write code for computing here
                        int i,j,sum;
                        float awt,atat,p,q;
                        int wt[]=new int[10];
                        int tat[]=new int[10];
                        wt[0]=0;
                        tat[0]=b[0];
                        for(i=1;i<count;i++)
                        {
                            sum=0;
                            for(j=0;j<i;j++)
                            {
                                sum+=b[j];
                            }
                            wt[i]=sum-a[i];
                            tat[i]=wt[i]+b[i];
                        }
                        TextView myText = (TextView) findViewById(R.id.textview1srtf);
                        myText.append("\n\nCOMPUTATIONS\n\nP[i]\t\tWT\t\tTAT\n\n");
                        for(i=0;i<count;i++){
                            myText.append("P["+i+"]\t\t"+wt[i]+"\t\t"+tat[i]+"\n\n");}
                        p=0;
                        q=0;
                        for(i=0;i<count;i++)
                        {
                            p+=wt[i];
                        }
                        awt=p/count;
                        for(i=0;i<count;i++)
                        {
                            q+=tat[i];
                        }
                        atat=q/count;
                        myText.append("Average Waiting Time is "+awt+"\n\n"+"Average Turnaround Time is "+atat);
                    }
                });

            }
        });

    }


    public void check() {
        EditText at = (EditText) dialog.findViewById(R.id.at);
        EditText bt = (EditText) dialog.findViewById(R.id.bt);
        // Perform action on click

        b[count] = Integer.valueOf(bt.getText().toString());
        a[count] = Integer.valueOf(at.getText().toString());

        TextView myText = (TextView) findViewById(R.id.textview1srtf);
        myText.append("P["+count+"]\t\t"+b[count]+"\t\t"+a[count]+"\n\n");
        count++;
    }
}
