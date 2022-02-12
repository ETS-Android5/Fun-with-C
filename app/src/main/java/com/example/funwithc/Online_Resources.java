package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Online_Resources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_resources);
        CardView ibit=(CardView) findViewById(R.id.ibit);
        ibit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.interviewbit.com/c-interview-questions/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        CardView javat=(CardView) findViewById(R.id.javatpoint);
        javat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.javatpoint.com/c-interview-questions";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        CardView tut=(CardView) findViewById(R.id.tutorialspoint);
        tut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.tutorialspoint.com/cprogramming/cprogramming_interview_questions.htm";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        CardView edure=(CardView) findViewById(R.id.edureka);
        edure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.edureka.co/blog/interview-questions/c-programming-interview-questions";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        CardView hio=(CardView) findViewById(R.id.hackrio);
        hio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://hackr.io/blog/c-interview-questions";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        CardView qscl=(CardView) findViewById(R.id.quescol);
        qscl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://quescol.com/interview-preparation/c-interview-questions";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        CardView gfor=(CardView) findViewById(R.id.geeksfor);
        gfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.geeksforgeeks.org/gate-programming-multiple-choice-questions-solutions/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        CardView gflow=(CardView) findViewById(R.id.gflow);
        gflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://gateoverflow.in/tag/programming-in-c";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        CardView examside=(CardView) findViewById(R.id.examside);
        examside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://questions.examside.com/past-years/gate/gate-cse/programming-languages/pointer-and-structure-in-c/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        CardView raud=(CardView)findViewById(R.id.raudra);
        raud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://pyq.ravindrababuravula.com/topic/?tp=C-Programming";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        CardView baij=(CardView)findViewById(R.id.baijuc);
        baij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://byjus.com/gate/c-programming-mcqs/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



    }
}