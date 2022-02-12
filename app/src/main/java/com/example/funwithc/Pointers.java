package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.barteksc.pdfviewer.PDFView;

public class Pointers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointers);
        PDFView pdfView=(PDFView) findViewById(R.id.pdfview);
        pdfView.fromAsset("arraysNpointers.pdf").load();

    }
}