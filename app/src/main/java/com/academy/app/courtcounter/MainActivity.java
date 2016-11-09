package com.academy.app.courtcounter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView3;
    private TextView textView6;
    private String team1Name;
    private String team2Name;
    private int a;
    private int b;
    private int team1Score;
    private int team2Score;

//    public EditText textView1(){
//
//    }
//
//    public EditText textView4(){
//
//    }

    public void blueClickPlus(Button button1){
        a++;
        textView3.setText(String.valueOf(a));
        textView3.setText(a);
        team1Score = a;
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.boom);
        mediaPlayer.start();
    }
    public void blueClickMinus(Button button4){
        a--;
        textView3.setText(String.valueOf(a));
        textView3.setText("" +a);
        team1Score = a;
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.boom);
        mediaPlayer.start();
    }
    public void redClickPlus(Button button2){
        b++;
        textView6.setText(String.valueOf(b));
        textView6.setText("" +b);
        team2Score = b;
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.boom);
        mediaPlayer.start();
    }
    public void redClickMinus(Button button5){
        b--;
        textView6.setText(String.valueOf(b));
        textView6.setText("" +b);
        team2Score = b;
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.boom);
        mediaPlayer.start();
    }
    public void resetClick(Button resetButton){
        AlertDialog gameOverAlert;
        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();
        gameOverAlert.setTitle("Alert Title");
        if (team1Score > team2Score) {
            gameOverAlert.setMessage(team1Name + " Wins!");
        }
        if (team2Score > team1Score) {
            gameOverAlert.setMessage(team2Name + " Wins!");
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
        //team1Name = textView1.getText().toString();
    }
}
