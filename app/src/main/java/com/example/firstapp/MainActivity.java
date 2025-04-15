package com.example.firstapp;

import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etUserName, etPass;
    Button btnLogin;
    String userName, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        etUserName = findViewById(R.id.et_user_name);
        etPass = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName = etUserName.getText().toString();
                pass = etPass.getText().toString();
                Toast.makeText(MainActivity.this,
                        userName + pass,LENGTH_SHORT).show();


            }
        });




    }
}