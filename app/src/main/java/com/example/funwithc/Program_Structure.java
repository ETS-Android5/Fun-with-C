package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class Program_Structure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_structure);
        getSupportActionBar().hide();
        TextView t=(TextView) findViewById(R.id.t);
        String temp="\"Let us take a look at the various parts of the above program:" + "\n" +
                "1. The first line of the program #include <stdio.h> is a preprocessor command, which tells a C compiler to include stdio.h file before going to actual compilation."+ "\n" +
                "2. The next line int main() is the main function where the program execution begins."+ "\n" +
                "3. The next line /*...*/ will be ignored by the compiler and it has been put to add"+ "\n" +
                "additional comments in the program. So such lines are called comments in the"+ "\n" +
                "program"+ "\n" +
                "4. The next line printf(...) is another function available in C which causes the message"+ "\n" +
                "\"Hello, World!\" to be displayed on the screen."+ "\n" +
                "        5. The next line return 0; terminates the main() function and returns the value 0."+ "\n";
        t.setText(temp);
    }
}