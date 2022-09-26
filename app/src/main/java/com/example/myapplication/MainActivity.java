package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        button1.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,MainActivity3.class);
            startActivity(intent);
        });
        button3.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,ConstraintLayoutTest.class);
            startActivity(intent);
        });
        button4.setOnClickListener(view -> {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ConstraintLayOut_Test2.class);
                startActivity(intent);
        });
    }
}