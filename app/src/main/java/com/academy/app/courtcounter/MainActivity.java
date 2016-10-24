package com.academy.app.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView3;
    private TextView textView6;
    private int a;
    public void onClick1(Button button1){
        a++;
        textView3.setText(String.valueOf(a));
        textView3.setText("" +a);
    }
    public void onClick2(Button button2){
        a++;
        textView6.setText(String.valueOf(a));
        textView6.setText("" +a);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setText("0");
        textView6 = (TextView)findViewById(R.id.textView6);
        textView6.setText("0");
    }
}
