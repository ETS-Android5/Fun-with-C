package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.chrisbanes.photoview.PhotoView;

public class loops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loops);
        getSupportActionBar().hide();
        PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.forloop);
        PhotoView photoView2 = (PhotoView) findViewById(R.id.photo_view2);
        photoView2.setImageResource(R.drawable.wileloop);
        PhotoView photoView3 = (PhotoView) findViewById(R.id.photo_view3);
        photoView3.setImageResource(R.drawable.dowile);

    }
}