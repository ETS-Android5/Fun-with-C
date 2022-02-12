package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class Operators extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);
        getSupportActionBar().hide();
        String text="These operators are used to assign a new value to a variable, a property, an event, or an indexer element. Generally the left side of assignment is variable and right is a constant/expression." + "\n\n" +
                "For example:" + "\n" +
                "int P=2"+"\n"+
                "This is a variable declaration as well as definition. In this statement P is declared as integer type and initialized to value 2."+"\n\n"+
                "Compound Assignment:Compound-assignment operators perform the operation specified by the additional operator, then assign the result to the left operand. For example:"+"\n"+
                "x+=2 is same as x=x+2"+"\n";
        TextView tv=(TextView) findViewById(R.id.tv1);
        tv.setText(text);
        TextView tv1=(TextView) findViewById(R.id.Ternary);
        String s="If any operator is used on three operands or variable is known as Ternary Operator. It can be represented with ? : . It is also called as conditional operator\\n\\nIt helps to think of the ternary operator as a shorthand way or writing an if-else statement. Programmers use the ternary operator for decision making in place of longer if and else conditional statements.For example\n\nint main()\n{\n2>1 ? printf(\"Hello\") : printf(\"World\");\n}\n\nOutput: \"Hello\" is printed";
        tv1.setText(s);
    }
}