package com.example.connexion;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText User1, User2, Pass1, Pass2;
    Button Inscrire, Login;

    SQLiteOpenHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User1 = findViewById(R.id.User1);
        User2 = findViewById(R.id.User2);
        Pass1 = findViewById(R.id.Pass1);
        Pass2 = findViewById(R.id.Pass2);
        Inscrire = findViewById(R.id.Inscrire);
        Login = findViewById(R.id.Login);

    }
}