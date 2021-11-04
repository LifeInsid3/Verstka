package com.example.verstka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AuthoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autho);

    }

    public void onLoginBTN (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onRegBTN (View view){
        Intent intent2 = new Intent(this, RegistrActivity.class);
        startActivity(intent2);
    }
}
