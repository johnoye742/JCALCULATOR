package com.johnoye742.jcalculator;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toolbar;


public class AboutMe extends Activity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    Typeface tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        Toolbar tb1 = (Toolbar) findViewById(R.id.tb1);
        setActionBar(tb1);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        tb1.setNavigationOnClickListener((v) -> finish());
          tv1 = (TextView) findViewById(R.id.tv1);
          tv2 = (TextView) findViewById(R.id.tv2);
          tv3 = (TextView) findViewById(R.id.tv3);
          tf = Typeface.createFromAsset(getAssets(), "fonts/mavenpro_bold.ttf");
          tv1.setTypeface(tf);
          tv2.setTypeface(tf);
          tv3.setTypeface(tf);
    }
}