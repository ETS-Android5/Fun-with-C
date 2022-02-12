package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.chrisbanes.photoview.PhotoView;

public class Decision_Making extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision_making);
        getSupportActionBar().hide();
        PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.iamif);
        PhotoView photoView2 = (PhotoView) findViewById(R.id.photo_view2);
        photoView2.setImageResource(R.drawable.el1);
        PhotoView photoView3 = (PhotoView) findViewById(R.id.photo_view3);
        photoView3.setImageResource(R.drawable.nested);
        PhotoView photoView4 = (PhotoView) findViewById(R.id.photo_view4);
        photoView4.setImageResource(R.drawable.elsi);
        PhotoView photoView5 = (PhotoView) findViewById(R.id.photo_view5);
        photoView5.setImageResource(R.drawable.switchcase);
        PhotoView photoView6 = (PhotoView) findViewById(R.id.photo_view6);
        photoView6.setImageResource(R.drawable.got);
    }
}