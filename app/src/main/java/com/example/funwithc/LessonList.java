package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class LessonList extends AppCompatActivity {
    CardView ov, ps, vndt, sc, o, dm, loo, fn, maic, pointers, strings, dma, fileio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_list);


        ov=(CardView) findViewById(R.id.Overview);
        ov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,Overview.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        ps=(CardView) findViewById(R.id.program_Structure);
        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,Program_Structure.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });


        vndt=(CardView) findViewById(R.id.Variable_and_Datatypes);
        vndt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,Data_Types.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        sc=(CardView) findViewById(R.id.Storage_classes);
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,Storage_Classes.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        o=(CardView) findViewById(R.id.Operators);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,Operators.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        dm=(CardView) findViewById(R.id.Decision_Making);
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,Decision_Making.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        loo=(CardView) findViewById(R.id.Loops);
        loo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,loops.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        fn=(CardView) findViewById(R.id.Functions);
        fn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,Functions.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        maic=(CardView) findViewById(R.id.Variables_inside_CPU);
        maic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this,Memory_Allocation_inside_CPU.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        pointers=(CardView)findViewById(R.id.Pointers);
        pointers.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(LessonList.this, Pointers.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        strings=(CardView) findViewById(R.id.Strings);
        strings.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this, Stringss.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);

            }
        });

        dma=(CardView) findViewById(R.id.DMA);
        dma.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this, Dynamic_memory_allocation.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

        fileio=(CardView) findViewById(R.id.FileIO);
        fileio.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LessonList.this, File_IO_in_C.class);
                startActivity(i);
                Animatoo.animateSlideLeft(LessonList.this);
            }
        });

    }
}