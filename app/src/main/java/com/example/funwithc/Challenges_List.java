package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Challenges_List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges_list);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        CardView challenge1=(CardView) findViewById(R.id.Challenge1);
        challenge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key","1");
                startActivity(i);
                Animatoo.animateSlideLeft(Challenges_List.this);
            }
        });

        CardView challenge2=(CardView) findViewById(R.id.Challenge2);
        challenge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key","2");
                startActivity(i);
                Animatoo.animateSlideLeft(Challenges_List.this);
            }
        });

        CardView challenge3=(CardView) findViewById(R.id.Challenge3);
        challenge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key","3");
                startActivity(i);
                Animatoo.animateSlideLeft(Challenges_List.this);
            }
        });




        CardView challenge4=(CardView) findViewById(R.id.MChallenge1);
        challenge4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key","4");
                startActivity(i);
                Animatoo.animateSlideLeft(Challenges_List.this);
            }
        });


        CardView challenge5=(CardView) findViewById(R.id.MChallenge2);
        challenge5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key","5");
                startActivity(i);
                Animatoo.animateSwipeLeft(Challenges_List.this);
            }
        });

        CardView challenge6=(CardView) findViewById(R.id.MChallenge3);
        challenge6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key", "6");
                startActivity(i);
                Animatoo.animateSwipeLeft(Challenges_List.this);
            }
        });


        CardView challenge7=(CardView) findViewById(R.id.AChallenge1);
        challenge7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key","7");
                startActivity(i);
                Animatoo.animateSlideLeft(Challenges_List.this);
            }
        });


        CardView challenge8=(CardView) findViewById(R.id.AChallenge2);
        challenge8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key","8");
                startActivity(i);
                Animatoo.animateSlideLeft(Challenges_List.this);
            }
        });

        CardView challenge9=(CardView) findViewById(R.id.AChallenge3);
        challenge9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Challenges_List.this, Challenge1.class);
                i.putExtra("key", "9");
                startActivity(i);
                Animatoo.animateSlideLeft(Challenges_List.this);
            }
        });

    }
}