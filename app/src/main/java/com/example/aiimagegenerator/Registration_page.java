package com.example.aiimagegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration_page extends AppCompatActivity {
    EditText editTextLoginUSERNAME, editTextLoginPassword;
    Button buttonLogin;
    TextView textViewNewuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration_page);
        editTextLoginPassword = findViewById(R.id.editTextLoginPASSWORD);
        editTextLoginUSERNAME = findViewById(R.id.editTextLoginUSERNAME);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewNewuser = findViewById(R.id.textViewNewuser);
        textViewNewuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iReg = new Intent(Registration_page.this, LoginPage.class);
                startActivity(iReg);
            }
        });











    }
}
