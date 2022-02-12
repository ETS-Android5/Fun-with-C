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
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class set2Quiz extends AppCompatActivity {

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
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(set2Quiz.this);
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
            public void onClick(View v) {
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
        quizModalArrayList.add(new QuizModal("What will be the output of the C program?\nint main()\n{\nint i = 5, j = 6, k = 7;\nif(i > j == k)\n    printf(\"%d %d %d\", i++, ++j, --k);\nelse\n    printf(\"%d %d %d\", i, j, k);\nreturn 0;\n}","5 7 6", "5 6 7", "6 6 6","5 7 7","5 6 7"));
        quizModalArrayList.add(new QuizModal("Choose correct statement.","Loops or Repetition block executes a group of statements repeatedly.", "Loop is usually executed as long as a condition is met.", "Loops usually take advantage of Loop Counter","All the above.","All the above."));
        quizModalArrayList.add(new QuizModal("Which loop is faster in C Language?","For", "While", "Do-While","All have same speed","All have same speed"));
        quizModalArrayList.add(new QuizModal("What is the way to suddenly come out of or Quit any Loop in C Language?","break; statement", "leave; statement", "quit; statement","continue; statement","break; statement"));
        quizModalArrayList.add(new QuizModal("Any C program","Needs input data", "Must contain atleast one fuction", "Need not contain any function","None of the above","Must contain atleast one fuction"));
        quizModalArrayList.add(new QuizModal("The keyword used to transfer control from a function back to the calling function is","switch", "goto", "return","go back","return"));
        quizModalArrayList.add(new QuizModal("While loop is used when user","knows the exact number of iterations", "does not knows the exact number of iterations", "Both of the above","None of the above","does not knows the exact number of iterations"));
        quizModalArrayList.add(new QuizModal("Every C Program should contain which function?","library", "main", "printf","scanf","main"));
        quizModalArrayList.add(new QuizModal("Choose correct statement:","else if is compulsory to use with if statement.", "else is compulsory to use with if statement.", "else or else if is optional with if statement.","None of the above","else or else if is optional with if statement."));
        quizModalArrayList.add(new QuizModal("A function which calls itself is called:","Calling Function", "Recieving Function", "Recursive Function","Repeating Function","Recursive Function"));
        quizModalArrayList.add(new QuizModal("Guess the output:\nint main()\n{\nif(5>7)\n   printf(\"Hurray\")\n   printf(\"Yes\");\nreturn 0;\n}","Yes", "Hurray", "Yes Hurray","Hurray Yes","Yes"));







    }
}