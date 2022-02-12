package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Challenge1 extends AppCompatActivity {
    TextView tvResult, tvExpected,ps;
    EditText etInput;
    EditText etStdin;
    Button btnSubmit;
    int qstn=0;

    APIClient api = APIClient.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        tvResult  = findViewById(R.id.tv_result);
        etInput   = findViewById(R.id.et_input);
        etStdin  = findViewById(R.id.stdin);
        tvExpected = findViewById(R.id.tv_expected);


        tvResult.setMovementMethod(new ScrollingMovementMethod());
        btnSubmit = findViewById(R.id.btn_submit);
        ps=findViewById(R.id.ps);

        Intent intent = getIntent();
        if(intent.getStringExtra("key").equals("1"))
        {
        ps.setText("Try to print the string same as expected output.");
        tvExpected.setText("Hello World!");
        }

        else if(intent.getStringExtra("key").equals("2"))
        {
        ps.setText("Declare 4 variable a,b,c,d of int, float, char and double type respectively. Print their sizes in bytes.");
        tvExpected.setText("a: 4\nb: 4\nc: 1\nd: 8");
        etInput.setHint("Input code here\n\nHint: Use sizeof() operator and %ld specifier");
        }

        else if(intent.getStringExtra("key").equals("3"))
        {
            ps.setText("Define two variables a=32 and b=8. Using arithmetic operations, find their sum, difference, proudct, quotient and remainder");
            tvExpected.setText("40\n24\n256\n4\n0");
        }

        else if(intent.getStringExtra("key").equals("4"))

        {
            ps.setText("Define 4 variables a=34, b=72, c=13 and d=56. Using if-else-if ladder Print the maximum number among them.");
            tvExpected.setText("72");
        }


        else if(intent.getStringExtra("key").equals("5"))
        {
            ps.setText("You are given 3 integer representing marks of Physics, Chemistry and Math. Find the average of the marks and Using switch case print the correponding grade as:\nAverage>70 : Grade A\n45<=Average<=70 : Grade B\nAverage<45 : Grade C");
            tvExpected.setText("Grade B");
            tvExpected.setTextSize(13);
            etInput.setHint("Note: You cannot change stdin here, please read the marks values using scanf() in your program");
            etStdin.setText("54 76 45");
            etStdin.setKeyListener(null);
        }


        else if(intent.getStringExtra("key").equals("6"))
        {
            ps.setText("Using for loop print the pattern as shown in expected output.");
            tvExpected.setText("*\n**\n***\n****\n*****\n");
        }



        else if(intent.getStringExtra("key").equals("7"))
        {
            qstn=7;
            ps.setText("A Strong passward must contain atleast 1 lower case, 1 upper case and 1 dgit and must be 8 characters long. Write a program to read a string and check whether it is strong passward or weak");
            tvExpected.setText("Input: FunwithC123\nOutput: Strong\n\nInput: funC\nOutput: Weak");
            etStdin.setHint("Test case is hidden");
            etStdin.setKeyListener(null);
        }

        else if(intent.getStringExtra("key").equals("8"))
        {
            qstn=8;
            ps.setText("Write a program to read a number, reverse it's digits and print the result as two times of reversed number.");
            tvExpected.setText("Input: 12\nOutput: 42\nInput: 72\nOutput: 54");
            etStdin.setHint("Test case is hidden");
            etStdin.setKeyListener(null);
        }

        else if(intent.getStringExtra("key").equals("9"))
        {
            qstn=9;
            ps.setText("If a word is scrambled to create a new word, the new word is called anagram to original word. Read two strings, Check whether they are anagram to each other or not. For example\nstr1 = pine,str2 = nipe.\nOutput: Yes\n");
            tvExpected.setText("Input: cat act\nOutput: Yes\n\nInput: food drink\nOutput: No");
            etStdin.setHint("Test case is hidden");
            etStdin.setKeyListener(null);
        }





    }

    public void runCompile(View view) {
        if(isOnline()) {
            if (qstn == 7) {
                etStdin.setText("Kushaal123");
                etStdin.setVisibility(View.INVISIBLE);
            }

            if (qstn == 8) {
                etStdin.setText("41");
                etStdin.setVisibility(View.INVISIBLE);
            }

            if (qstn == 9) {
                etStdin.setText("cheap peach");
                etStdin.setVisibility(View.INVISIBLE);
            }


            Call<String> execute = api.getAPI().execute(new PostData(etInput.getText().toString(), etStdin.getText().toString()));

            tvResult.setText("Loading...");

            execute.enqueue(new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {
                    try {
                        if (response.isSuccessful()) {
                            JSONObject jsonObject = new JSONObject(response.body());
                            String output = jsonObject.getString("output");
                            tvResult.setText(output);


                            if (output.equals(tvExpected.getText()) && qstn != 7 && qstn != 8 && qstn != 9) {
                                tvResult.setBackgroundColor(Color.parseColor("#FF69F477"));
                                Dialog dialog = new Dialog(Challenge1.this);
                                dialog.setContentView(R.layout.dialog_layout);
                                dialog.setCanceledOnTouchOutside(true);
                                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                dialog.getWindow().setWindowAnimations(R.style.AnimationForDialog);
                                dialog.show();
                            } else if (qstn == 7 && output.equals("Strong")) {
                                tvResult.setText("Test Case passed Successfully!");
                                tvResult.setBackgroundColor(Color.parseColor("#FF69F477"));
                                etStdin.setText("");
                                etStdin.setVisibility(View.VISIBLE);
                                Dialog dialog = new Dialog(Challenge1.this);
                                dialog.setContentView(R.layout.dialog_layout);
                                dialog.setCanceledOnTouchOutside(true);
                                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                dialog.getWindow().setWindowAnimations(R.style.AnimationForDialog);
                                dialog.show();
                            } else if (qstn == 7 && !output.equals("Strong")) {
                                tvResult.setText("Test Case failed!");
                                etStdin.setText("");
                                etStdin.setVisibility(View.VISIBLE);
                                tvResult.setBackgroundColor(Color.parseColor("#88FD1A1A"));
                            } else if (qstn == 8 && output.equals("28")) {
                                tvResult.setText("Test Case passed Successfully!");
                                tvResult.setBackgroundColor(Color.parseColor("#FF69F477"));
                                etStdin.setText("");
                                etStdin.setVisibility(View.VISIBLE);
                                Dialog dialog = new Dialog(Challenge1.this);
                                dialog.setContentView(R.layout.dialog_layout);
                                dialog.setCanceledOnTouchOutside(true);
                                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                dialog.getWindow().setWindowAnimations(R.style.AnimationForDialog);
                                dialog.show();
                            } else if (qstn == 8 && !output.equals("28")) {
                                tvResult.setText("Test Case failed!");
                                etStdin.setText("");
                                etStdin.setVisibility(View.VISIBLE);
                                tvResult.setBackgroundColor(Color.parseColor("#88FD1A1A"));
                            } else if (qstn == 9 && output.equals("Yes")) {
                                tvResult.setText("Test Case passed Successfully!");
                                tvResult.setBackgroundColor(Color.parseColor("#FF69F477"));
                                etStdin.setText("");
                                etStdin.setVisibility(View.VISIBLE);
                                Dialog dialog = new Dialog(Challenge1.this);
                                dialog.setContentView(R.layout.dialog_layout);
                                dialog.setCanceledOnTouchOutside(true);
                                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                dialog.getWindow().setWindowAnimations(R.style.AnimationForDialog);
                                dialog.show();
                            } else if (qstn == 9 && !output.equals("Yes")) {
                                tvResult.setText("Test Case failed!");
                                etStdin.setText("");
                                etStdin.setVisibility(View.VISIBLE);
                                tvResult.setBackgroundColor(Color.parseColor("#88FD1A1A"));
                            } else {
                                tvResult.setBackgroundColor(Color.parseColor("#88FD1A1A"));
                            }

                        } else {
                            showSnackBar(response.errorBody().toString());
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        showSnackBar("Gagal Parsing JSON : " + e.getMessage());
                    }
                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {
                    tvResult.setText("Failed");
                    showSnackBar("Gagal : " + t.getMessage());
                }
            });
        }
    }

    public boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Challenge1.this.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
            Toast.makeText(Challenge1.this, "No Internet connection!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    private void showSnackBar(String message) {
        Toast.makeText(Challenge1.this, message, Toast.LENGTH_SHORT).show();
    }
}