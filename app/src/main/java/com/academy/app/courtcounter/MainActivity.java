package com.academy.app.courtcounter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView3;
    private TextView textView6;
    private int a;
    private int b;
    private int team1Score;
    private int team2Score;

    public void onClick1(Button button1){
        a++;
        textView3.setText(String.valueOf(a));
        textView3.setText("" +a);
        team1Score = a;
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.boom);
        mediaPlayer.start();
    }
    public void onClick2(Button button2){
        b++;
        textView6.setText(String.valueOf(b));
        textView6.setText("" +b);
        team2Score = b;
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.boom);
        mediaPlayer.start();

    }
    public void onClick3(Button resetButton){
        AlertDialog gameOverAlert;
        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();
        gameOverAlert.setTitle("Alert Title");
        if (team1Score > team2Score) {
            gameOverAlert.setMessage("Team 1 wins");
        }
        if (team2Score > team1Score) {
            gameOverAlert.setMessage("Team 2 wins");
        }
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
