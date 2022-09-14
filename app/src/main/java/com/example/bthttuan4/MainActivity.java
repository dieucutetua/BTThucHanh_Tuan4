package com.example.bthttuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUserName, edtPassword;
    Button btnlogin, btnsigup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        edtUserName = (EditText)findViewById(R.id.txtUserName);
        edtPassword = (EditText)findViewById(R.id.txtPassword);
        btnlogin    = (Button)findViewById(R.id.buttonLogin);
        btnsigup = (Button)findViewById(R.id.buttonSigup);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "admin";
                String password = "admin";
                if(edtUserName.getText().toString().equals(username) && edtPassword.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(), "Login successfully", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Profile.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnsigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}