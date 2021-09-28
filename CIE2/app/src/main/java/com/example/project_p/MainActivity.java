package com.example.project_p;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valUsername = edtUsername.getText().toString();
                String valPassword = edtPassword.getText().toString();

                if (!Patterns.EMAIL_ADDRESS.matcher(valUsername).matches()) {
                    Toast.makeText(MainActivity.this, "Enter Proper email Address", Toast.LENGTH_SHORT).show();
                }

                if (valUsername.equals("admin@gmail.com") && valPassword.equals("admin")) {

                    Intent intent = new Intent(MainActivity.this,DashBoard.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}