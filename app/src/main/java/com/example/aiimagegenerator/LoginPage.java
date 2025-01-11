package com.example.aiimagegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPage extends AppCompatActivity {
    EditText editTextLoginUSERNAME, editTextLoginPassword;
    Button buttonLogin;
    TextView textViewNewuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);
        editTextLoginUSERNAME = findViewById(R.id.editTextLoginUSERNAME);
        editTextLoginPassword = findViewById(R.id.editTextLoginPASSWORD);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewNewuser = findViewById(R.id.textViewNewuser);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = editTextLoginUSERNAME.getText().toString();
                String Password = editTextLoginPassword.getText().toString();
                if(Username.isEmpty() || Password.isEmpty()){
                    Toast.makeText(LoginPage.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(LoginPage.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent iMain = new Intent(LoginPage.this,Home_Page.class);
                        startActivity(iMain);
                    }
            }
        });
            textViewNewuser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent iReg = new Intent(LoginPage.this, Registration_page.class);
                    startActivity(iReg);
                }
            });
    }
}

