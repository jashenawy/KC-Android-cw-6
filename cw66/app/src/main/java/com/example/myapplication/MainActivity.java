package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList <student> Student = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        student s1 = new student("يوسف",14,13,R.drawable.yousef);
        student s2 = new student("سلمان",13,10,R.drawable.sleman);
        student s3 = new student("ماجد",15,11,R.drawable.majed);
        student s4 = new student("محمد",16,18,R.drawable.majed);



     Student.add(s1);
     Student.add(s2);
     Student.add(s3);
     Student.remove(s4);



      ListView listView = findViewById(R.id.listview);



    }

}