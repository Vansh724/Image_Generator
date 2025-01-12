package com.example.aiimagegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home_Page extends AppCompatActivity {
    ImageView imageViewGenerate, imageViewHistory, imageViewSettings, imageViewAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        imageViewGenerate = findViewById(R.id.imageViewGenerate);
        imageViewAbout = findViewById(R.id.imageViewAbout);
        imageViewHistory = findViewById(R.id.imageViewHistory);
        imageViewSettings = findViewById(R.id.imageViewSettings);
        imageViewGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iReg = new Intent(Home_Page.this, MainActivity.class);
                startActivity(iReg);
            }
        });
        imageViewHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iReg = new Intent(Home_Page.this, HistoryPage.class);
                startActivity(iReg);
            }
        });
        imageViewAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iReg = new Intent(Home_Page.this, AboutPage.class);
                startActivity(iReg);
            }
        });
        imageViewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iReg = new Intent(Home_Page.this,SettingsPage.class);
                startActivity(iReg);
            }
        });
    }
}








