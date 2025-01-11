package com.example.aiimagegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;


public class FirstPage extends AppCompatActivity {
private ProgressBar progressBar;
private Timer timer;
private int progressStatus = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        progressBar = findViewById(R.id.progressBar3);
        timer = new Timer();
      timer.schedule(new TimerTask() {
          @Override
          public void run() {
              if(progressStatus<100){
                  runOnUiThread(new Runnable(){
                      @Override
                      public void run() {
                      }});
                  progressBar.setProgress(progressStatus);
                  progressStatus++;}
                      else {
                          timer.cancel();
//                          runOnUiThread(new Runnable() {
//                      @Override
//                      public void run() {
//                          Intent iLogin = new Intent(FirstPage.this, LoginPage.class);
//                       startActivity(iLogin);
//                      }
//                  });
                  }
          }
      },0,50);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iLogin = new Intent(FirstPage.this, LoginPage.class);
                startActivity(iLogin);
            }
        },5000  );
        }
    }