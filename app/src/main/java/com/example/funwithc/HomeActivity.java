package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class HomeActivity extends AppCompatActivity {
    ImageView viewLesson, takeQuiz, challenge, online_resources;

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        viewLesson=(ImageView)findViewById(R.id.view_lesson);
        viewLesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, LessonList.class);
                startActivity(intent);
                Animatoo.animateSlideLeft(HomeActivity.this);
            }
        });




        takeQuiz=(ImageView)findViewById(R.id.takeQuiz);
        takeQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,Quiz_list.class);
                startActivity(i);
                Animatoo.animateSlideLeft(HomeActivity.this);
            }
        });

        challenge=(ImageView) findViewById(R.id.challenges);
        challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, Challenges_List.class);
                startActivity(i);
                Animatoo.animateSlideLeft(HomeActivity.this);
            }
        });

        online_resources=(ImageView) findViewById(R.id.onlin_resources);
        online_resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, Online_Resources.class);
                startActivity(i);
                Animatoo.animateSlideLeft(HomeActivity.this);
            }
        });

    }
}