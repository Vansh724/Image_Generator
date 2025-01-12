package com.example.aiimagegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Registration_page extends AppCompatActivity {
    EditText editTextregUSERNAME, editTextregPassword, editTextregConfirm ,editTextregEmail;
    Button buttonreg;
    TextView textViewNewuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration_page);
        editTextregPassword = findViewById(R.id.editTextregPASSWORD);
        editTextregUSERNAME = findViewById(R.id.editTextregUSERNAME);
        buttonreg = findViewById(R.id.buttonreg);
        textViewNewuser = findViewById(R.id.textViewNewuser);
        textViewNewuser.setOnClickListener(view -> {
            Intent iReg = new Intent(Registration_page.this, LoginPage.class);
            startActivity(iReg);
        });

          buttonreg.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String Username = editTextregUSERNAME.getText().toString();
                  String Password = editTextregPassword.getText().toString();
                  String email = editTextregEmail.getText().toString();
                  String confirm = editTextregConfirm.getText().toString();
                  if (Username.isEmpty() || Password.isEmpty() || email.isEmpty() || confirm.isEmpty()) {
                      Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
                  }
                  if (!Password.equals(confirm)) {
                      Toast.makeText(getApplicationContext(), "Passwords do not match", Toast.LENGTH_SHORT).show();

                  }
              }
          });
    }
}
