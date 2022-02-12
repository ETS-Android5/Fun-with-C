package com.example.funwithc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.funwithc.QuizModal;
import com.example.funwithc.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class set1Quiz extends AppCompatActivity {

    private TextView questionTV, questionNumberTV;
    private AppCompatButton option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;

    int currentScore = 0, questionAttempted=0, currentPos, randomqstn=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set1_quiz);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        questionTV=findViewById(R.id.idTvQuestion);
        questionNumberTV=findViewById(R.id.idTvQuestionAttempted);
        option1Btn=findViewById(R.id.idBtnOption1);
        option2Btn=findViewById(R.id.idBtnOption2);
        option3Btn=findViewById(R.id.idBtnOption3);
        option4Btn=findViewById(R.id.idBtnOption4);
        quizModalArrayList = new ArrayList<>();
        getQuizQuestion(quizModalArrayList);

        ArrayList<Integer> qid = new ArrayList<Integer>();
        for (int i=0; i<quizModalArrayList.size(); i++) {
            qid.add(i);
        }
        Collections.shuffle(qid);

        currentPos=qid.get(randomqstn++);

        setDatatoViews(currentPos);
        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                    option1Btn.setBackgroundColor(Color.GREEN);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            option1Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                            questionAttempted++;
                            currentPos=qid.get(randomqstn++);
                            setDatatoViews(currentPos);
                        }
                    }, 1200);

                }
                else
                {
                    option1Btn.setBackgroundColor(Color.RED);
                    if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())) {
                        option2Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option1Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option2Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);
                    }
                    else if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase()))
                    {
                        option3Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option1Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option3Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);
                    }

                    else
                    {
                        option4Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option1Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option4Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);

                    }



                }


            }
        });

        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                    option2Btn.setBackgroundColor(Color.GREEN);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            option2Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                            questionAttempted++;
                            currentPos=qid.get(randomqstn++);
                            setDatatoViews(currentPos);
                        }
                    }, 1200);

                }
                else
                {
                    option2Btn.setBackgroundColor(Color.RED);
                    if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase()))
                    {
                        option3Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option2Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option3Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);
                    }

                    else if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase()))
                    {
                        option4Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option2Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option4Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);
                    }
                    else
                    {
                        option1Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option2Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option1Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);

                    }

                }


            }
        });

        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                    option3Btn.setBackgroundColor(Color.GREEN);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            option3Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                            questionAttempted++;
                            currentPos=qid.get(randomqstn++);
                            setDatatoViews(currentPos);
                        }
                    }, 1200);

                }
                else
                {
                    option3Btn.setBackgroundColor(Color.RED);
                    if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase()))
                    {
                        option4Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option3Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option4Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);

                    }

                    else if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase()))
                    {
                        option1Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option3Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option1Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);

                    }

                    else
                    {
                        option2Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option3Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option2Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);



                    }

                }


            }
        });

        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                    option4Btn.setBackgroundColor(Color.GREEN);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            option4Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                            questionAttempted++;
                            currentPos=qid.get(randomqstn++);
                            setDatatoViews(currentPos);
                        }
                    }, 1200);

                }
                else
                {
                    option4Btn.setBackgroundColor(Color.RED);
                    if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())) {
                        option1Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option4Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option1Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);
                    }

                    else if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase()))
                    {
                        option2Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option4Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option2Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);
                    }

                    else
                    {
                        option3Btn.setBackgroundColor(Color.GREEN);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                option4Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                option3Btn.setBackgroundColor(Color.parseColor("#BB86FC"));
                                questionAttempted++;
                                currentPos=qid.get(randomqstn++);
                                setDatatoViews(currentPos);
                            }
                        }, 1200);
                    }

                }



            }
        });

    }





    private void showBottomSheet(){
        randomqstn=0;
        ArrayList<Integer> pid = new ArrayList<Integer>();
        for (int i=0; i<quizModalArrayList.size(); i++) {
            pid.add(i);
        }
        Collections.shuffle(pid);
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(set1Quiz.this);
        View bottomSheetView= LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet, (CoordinatorLayout)findViewById(R.id.CC_Score));
        TextView scoreTv= bottomSheetView.findViewById(R.id.idTVScore);
        Button restartQuizBtn=bottomSheetView.findViewById(R.id.idBtnRestartQuiz);
        Button goBackBtn=bottomSheetView.findViewById(R.id.idBtnGoBack);
        restartQuizBtn.setBackgroundColor(Color.DKGRAY);
        restartQuizBtn.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        restartQuizBtn.setWidth(400);
        restartQuizBtn.setHeight(200);
        goBackBtn.setBackgroundColor(Color.DKGRAY);
        goBackBtn.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        goBackBtn.setWidth(400);
        goBackBtn.setHeight(200);
        scoreTv.setText("\t\tYour Score is:"+currentScore+"/10");
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                currentPos=pid.get(randomqstn++);
                questionAttempted=0;
                currentScore=0;
                setDatatoViews(currentPos);
                bottomSheetDialog.dismiss();
            }
        });
        goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }





    private void setDatatoViews(int currentPos) {
        questionNumberTV.setText("Questions Attempted: " + questionAttempted + "/10");
        if (questionAttempted == 10) {
            showBottomSheet();
        }
        else {
            questionTV.setText(quizModalArrayList.get(currentPos).getQuestion());
            option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
            option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());
        }
    }

    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {

        quizModalArrayList.add(new QuizModal("The format identifier '%i' is also used for _____ data type?","char", "int", "float","double","int"));
        quizModalArrayList.add(new QuizModal("What is the size of an double data type","2 bytes", "4 bytes", "8 bytes","Depends on Compiler","8 bytes"));
        quizModalArrayList.add(new QuizModal("By default a real number is treated as a","float", "int", "double","unsigned int","float"));
        quizModalArrayList.add(new QuizModal("What are the entities whose values can be changed called?","Tokens", "Module", "Constants","Variables","Variables"));
        quizModalArrayList.add(new QuizModal("Operator % in C Language is called?","Percentage Operator", "Modulus", "Quotient Operator","Division","Modulus"));
        quizModalArrayList.add(new QuizModal("Given: int a = 10 + 4.867;\nChoose the right statement:","a = 10", "a = 14.867", "a = 14","compiler error","a = 14"));
        quizModalArrayList.add(new QuizModal("int main()\n{\n    float c = 3.5 + 4.5;\n    printf(\"%f\", c);\n    return 0;\n}\n\nGuess the output","8.000000", "8.0", "8","7","8.000000"));
        quizModalArrayList.add(new QuizModal("In C language, which Operator group has more priority between (*, / and %) and (+, -) groups?","Both groups share equal priority.", "(+, -) > (*, / and %)", "(+, -) < (*, / and %)","None of the above","(+, -) < (*, / and %)"));
        quizModalArrayList.add(new QuizModal("Which bitwise operator is suitable for checking whether a particular bit is on or off?","&& operator", "& operator", "|| operator","! operator","& operator"));
        quizModalArrayList.add(new QuizModal("Which of the following is not a logical operator?","&", "&&", "!","||","&"));

        quizModalArrayList.add(new QuizModal("The format identifier '%i' is also used for _____ data type?","char", "int", "float","double","int"));

    }
}