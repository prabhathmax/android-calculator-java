package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDel, btnEqual, btnDivide, btnMultiply, btnPlus, btnMinus, btnPercentage, btnPoint;
    EditText display;
    float mValOne, mValTwo;
    boolean minus, divide, plus, multiply, percentage, pointClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnPercentage = (Button) findViewById(R.id.btnPercentage);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnDel = (Button) findViewById(R.id.btnDel);
        display = (EditText) findViewById(R.id.display);

        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!pointClicked) {
                    display.setText(display.getText() + ".");
                    pointClicked = true;
                }
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textString = display.getText().toString();
                if( textString.length() > 0 ) {
                    display.setText(textString.substring(0, textString.length() - 1 ));
                    display.setSelection(display.getText().length());//position cursor at the end of the line
                }
                if(textString.length() == 1 | textString.length() == 0) {
                    pointClicked = false;
                    minus = false;
                    divide = false;
                    plus = false;
                    multiply = false;
                    percentage = false;
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValOne = Float.parseFloat(display.getText() + "");
                    plus = true;
                    display.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValOne = Float.parseFloat(display.getText() + "");
                    minus = true;
                    pointClicked = false;
                    display.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValOne = Float.parseFloat(display.getText() + "");
                    divide = true;
                    pointClicked = false;
                    display.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValOne = Float.parseFloat(display.getText() + "");
                    multiply = true;
                    pointClicked = false;
                    display.setText(null);
                }
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValOne = Float.parseFloat(display.getText() + "");
                    percentage = true;
                    pointClicked = false;
                    display.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValTwo = Float.parseFloat(display.getText() + "");

                if (plus == true) {
                    display.setText(mValOne + mValTwo + "");
                    plus = false;
                    pointClicked = false;
                }

                if (minus == true) {
                    display.setText(mValOne - mValTwo + "");
                    minus = false;
                    pointClicked = false;
                }

                if (multiply == true) {
                    display.setText(mValOne * mValTwo + "");
                    multiply = false;
                    pointClicked = false;
                }

                if (divide == true) {
                    display.setText(mValOne / mValTwo + "");
                    divide = false;
                    pointClicked = false;
                }

                if (percentage == true) {
                    display.setText((mValOne * mValTwo)/100 + "");
                    percentage = false;
                    pointClicked = false;
                }
            }
        });

    }
}