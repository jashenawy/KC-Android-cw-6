package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class mainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        TextView t = findViewById(R.id.titel);
        TextView name = findViewById(R.id.name);
        TextView age = findViewById(R.id.age);
        TextView grade = findViewById(R.id.grade);
        ImageView im = findViewById(R.id.img);


    }
}