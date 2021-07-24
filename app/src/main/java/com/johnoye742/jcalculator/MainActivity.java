package com.johnoye742.jcalculator;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

import java.util.Arrays;

public class MainActivity extends Activity implements View.OnClickListener {
TextView textView2;
TextView textView1;
Button btn1;
Button btn2;
Button btn3;
Button btn4;
Button btn5;
Button btn6;
Button btn7;
Button btn8;
Button btn9;
Button btn0;
Button btnAdd;
Button btnSubtract;
Button btnMultiply;
Button btnDivide;
Button btnDel;
Button btnSqrt;
Button dot;
Button equals;
public static int f;
public static int i;
public static double val1 = 0;
public static double val2 = 0;
public static String operation;
Typeface tf;
FrameLayout fl;
TextView t;
Toolbar tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            tb = (Toolbar) findViewById(R.id.tb);
            setActionBar(tb);
            tf = Typeface.createFromAsset(getAssets(), "fonts/mavenpro_bold.ttf");
            textView2 = (TextView) findViewById(R.id.textView2);
            textView1 = (TextView) findViewById(R.id.textView1);

            btn1 = (Button) findViewById(R.id.btn1);
            btn2 = (Button) findViewById(R.id.btn2);
            btn3 = (Button) findViewById(R.id.btn3);
            btn4 = (Button) findViewById(R.id.btn4);
            btn5 = (Button) findViewById(R.id.btn5);
            btn6 = (Button) findViewById(R.id.btn6);
            btn7 = (Button) findViewById(R.id.btn7);
            btn8 = (Button) findViewById(R.id.btn8);
            btn9 = (Button) findViewById(R.id.btn9);
            btn0 = (Button) findViewById(R.id.btn0);
            btnAdd = (Button) findViewById(R.id.btn_add);
            equals = (Button) findViewById(R.id.btn_equals);
            fl = (FrameLayout) findViewById(R.id.tst);
             t = (TextView) findViewById(R.id.tv);
            btnSubtract = (Button) findViewById(R.id.btn_subtract);
            btnMultiply = (Button) findViewById(R.id.btn_multiply);
            btnDivide = (Button) findViewById(R.id.btn_divide);
            btnDel = (Button) findViewById(R.id.btn_del);
            btnSqrt = (Button) findViewById(R.id.btn_sqrt);
            dot = (Button) findViewById(R.id.btn_dot);
            btn1.setOnClickListener(this);
            btn2.setOnClickListener(this);
            btn3.setOnClickListener(this);
            btn4.setOnClickListener(this);
            btn5.setOnClickListener(this);
            btn6.setOnClickListener(this);
            btn7.setOnClickListener(this);
            btn8.setOnClickListener(this);
            btn9.setOnClickListener(this);
            btn0.setOnClickListener(this);
            btnAdd.setOnClickListener(this);
            btnSubtract.setOnClickListener(this);
            btnMultiply.setOnClickListener(this);
            btnDivide.setOnClickListener(this);
            btnDel.setOnClickListener(this);
            btnSqrt.setOnClickListener(this);
            dot.setOnClickListener(this);
            equals.setOnClickListener(this);
            textView1.setTypeface(tf);
            textView2.setTypeface(tf);
            btn1.setTypeface(tf);
            btn2.setTypeface(tf);
            btn3.setTypeface(tf);
            btn4.setTypeface(tf);
            btn5.setTypeface(tf);
            btn6.setTypeface(tf);
            btn7.setTypeface(tf);
            btn8.setTypeface(tf);
            btn9.setTypeface(tf);
            btn0.setTypeface(tf);
            btnAdd.setTypeface(tf);
            btnSubtract.setTypeface(tf);
            btnMultiply.setTypeface(tf);
            btnDivide.setTypeface(tf);
            btnDel.setTypeface(tf);
            dot.setTypeface(tf);
            equals.setTypeface(tf);

            ValueAnimator va = ValueAnimator.ofInt(0, 90);
            va.setDuration(1000);
            va.start();
            va.addUpdateListener(animation -> {
                 f = (int) animation.getAnimatedValue();
                widtheight(btn1);
                widtheight(btn2);
                widtheight(btn3);
                widtheight(btn4);
                widtheight(btn5);
                widtheight(btn6);
                widtheight(btn7);
                widtheight(btn8);
                widtheight(btn9);
                widtheight(btn0);
                widtheight(btnAdd);
                widtheight(btnSubtract);
                widtheight(btnMultiply);
                widtheight(btnDivide);
                widtheight(btnDel);
                widtheight(dot);
                widtheight(equals);
                widtheight(btnSqrt);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    public static void widtheight(Button btn) {
    btn.setMaxWidth(f);
    btn.setMaxHeight(f);
    btn.setMinHeight(f);
    btn.setMinWidth(f);
}

public void show(String text) {
        try {

   t.setText(text);
   fl.setVisibility(View.VISIBLE);


    CountDownTimer cdt = new CountDownTimer(3000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {
            fl.setVisibility(View.GONE);
        }

    }.start();
        } catch(Exception e) {
         e.printStackTrace();
         Log.e("Error", Arrays.toString(e.getStackTrace()));
            Toast.makeText(MainActivity.this, Arrays.toString(e.getStackTrace()), Toast.LENGTH_LONG).show();
        }
}
    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        try {
            switch (v.getId()) {
                case R.id.btn_del:
                    textView1.setText("");
                    textView2.setText("0");
                    break;
                case R.id.btn0:
                    textView1.append("0");
                    break;
                case R.id.btn1:
                    textView1.append("1");
                    show("1");
                    break;
                case R.id.btn2:
                    textView1.append("2");
                    show("2");
                    break;
                case R.id.btn3:
                    textView1.append("3");
                    show("3");
                    break;
                case R.id.btn4:
                    textView1.append("4");
                    break;
                case R.id.btn5:
                    textView1.append("5");
                    break;
                case R.id.btn6:
                    textView1.append("6");
                    break;
                case R.id.btn7:
                    textView1.append("7");
                    break;
                case R.id.btn8:
                    textView1.append("8");
                    break;
                case R.id.btn9:
                    textView1.append("9");
                    break;
                case R.id.btn_add:
                    operation = "+";

                    if (i == 0) {

                        val1 = Double.parseDouble(textView1.getText().toString());
                        textView2.setText(textView1.getText().toString());
                        textView1.setText("");

                    }


                    break;
                case R.id.btn_subtract:
                    operation = "-";

                    if (i == 0) {

                        val1 = Double.parseDouble(textView1.getText().toString());
                        textView2.setText(textView1.getText().toString());
                        textView1.setText("");

                    }


                    break;
                case R.id.btn_multiply:
                    operation = "*";

                    if (i == 0) {

                        val1 = Double.parseDouble(textView1.getText().toString());
                        textView2.setText(textView1.getText().toString());
                        textView1.setText("");

                    }


                    break;
                case R.id.btn_divide:
                    operation = "/";

                    if (i == 0) {

                        val1 = Double.parseDouble(textView1.getText().toString());
                        textView2.setText(textView1.getText().toString());
                        textView1.setText("");

                    }


                    break;
                case R.id.btn_dot:
                    textView1.append(".");
                    show("This app was created with love by John Oye.");
                    break;
                case R.id.btn_sqrt:
                    double d = Math.sqrt(Double.parseDouble(textView1.getText().toString()));
                    textView2.setText(Double.toString(d));
                    break;
                case R.id.btn_equals:
                    try {
                        val2 = Double.parseDouble(textView1.getText().toString());
                        switch (operation) {
                            case "+": {
                                double equal = val1 + val2;
                                textView2.setText(Double.toString(equal));
                                val1 = 0;
                                val2 = 0;
                                break;
                            }
                            case "-": {
                                double equal = val1 - val2;
                                textView2.setText(Double.toString(equal));
                                val1 = 0;
                                val2 = 0;
                                break;
                            }
                            case "*": {
                                double equal = val1 * val2;
                                textView2.setText(Double.toString(equal));
                                val1 = 0;
                                val2 = 0;
                                break;
                            }
                            case "/": {
                                double equal = val1 / val2;
                                textView2.setText(Double.toString(equal));
                                val1 = 0;
                                val2 = 0;
                                break;
                            }
                        }


                    } catch (Exception e) {
                        String err = Arrays.toString(e.getStackTrace());
                        show(e.getMessage());
                        show(err);

                    }
                    break;
            }
        } catch(Exception e) {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.about:
                Intent i1 = new Intent(this, AboutMe.class);
                startActivity(i1);
                return true;
            case R.id.exit:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}