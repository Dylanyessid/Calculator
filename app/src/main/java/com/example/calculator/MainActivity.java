package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton one,two,three,four,five,six,seven,eight,nine,zero,dot,equals,fn,division,multiply,diff,plus,percentage,delete,ac;

        one = (ImageButton) findViewById(R.id.iB1);
        two = (ImageButton) findViewById(R.id.iB2);
        three = (ImageButton) findViewById(R.id.iB3);
        four = (ImageButton) findViewById(R.id.iB4);
        five = (ImageButton) findViewById(R.id.iB5);
        six = (ImageButton) findViewById(R.id.iB6);
        seven = (ImageButton) findViewById(R.id.iB7);
        eight = (ImageButton) findViewById(R.id.iB8);
        nine = (ImageButton) findViewById(R.id.iB9);
        zero = (ImageButton) findViewById(R.id.iB0);

        dot = (ImageButton) findViewById(R.id.iBDot);
        equals = (ImageButton) findViewById(R.id.iBEquals);
        fn = (ImageButton) findViewById(R.id.iBFN);
        division = (ImageButton) findViewById(R.id.iBDivision);
        multiply = (ImageButton) findViewById(R.id.iBMultiply);
        diff = (ImageButton) findViewById(R.id.iBDiff);
        plus = (ImageButton) findViewById(R.id.iBPlus);
        percentage = (ImageButton) findViewById(R.id.iBPercentage);
        delete = (ImageButton) findViewById(R.id.iBDel);
        ac = (ImageButton) findViewById(R.id.iBAC);


    }

    public void checkButtonClicked(View view){
        System.out.println(view.toString());
    }

}