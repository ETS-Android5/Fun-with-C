package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Quiz_list extends AppCompatActivity {
    CardView set1, set2, set3;

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_list);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        set1=(CardView) findViewById(R.id.set1);

        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Quiz_list.this, set1Quiz.class);
                startActivity(i);
                Animatoo.animateSlideLeft(Quiz_list.this);
            }
        });

        set2=(CardView) findViewById(R.id.set2);
        set2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Quiz_list.this, set2Quiz.class);
                startActivity(i);
                Animatoo.animateSlideLeft(Quiz_list.this);
            }
        });


        set3=(CardView) findViewById(R.id.set3);
        set3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Quiz_list.this, set3Quiz.class);
                startActivity(i);
                Animatoo.animateSlideLeft(Quiz_list.this);
            }
        });



    }
}