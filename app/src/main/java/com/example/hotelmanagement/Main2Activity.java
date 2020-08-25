package com.example.hotelmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuthException;



public class Main2Activity extends AppCompatActivity {
    EditText name,password,phone,email;
    Button btn2;
    FirebaseAuthException fAuth;
    ProgressBar pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        btn2 = findViewById(R.id.btn2);
        pro = findViewById(R.id.pro);
    }
}
