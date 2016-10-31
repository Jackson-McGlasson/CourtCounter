package com.academy.app.courtcounter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView3;
    private TextView textView6;
    private int a;
  //  public team1Score = String.valueOf(textView6)
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
    public void onClick3(Button resetButton){
        AlertDialog gameOverAlert;
        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();
        gameOverAlert.setTitle("Alert Title");
      //  if (team1Score > team2Score) {
            gameOverAlert.setMessage("Team 1 wins");
      //  }
        gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        gameOverAlert.show();
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
