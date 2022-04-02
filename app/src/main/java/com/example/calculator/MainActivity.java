package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    int count = 1;
    private String operation = "";
    private double decimalPart = 0;
    private double firstNum =0;
    private double secondNum;
    private boolean isSetOperator= false;
    private boolean isSetDecimals = false;

    public String addFirstNumber(String number){

        if(!isSetDecimals){
            firstNum = (firstNum*10) + Integer.parseInt(number);
        }else {
            decimalPart =Double.parseDouble(number)/Math.pow(10,count);
            firstNum = firstNum + decimalPart;
            count++;
        }


        return Double.toString(firstNum);
    }

    public String addSecondNumber(String number){
        if(!isSetDecimals){
            secondNum = (secondNum*10) + Integer.parseInt(number);
        }else{
            decimalPart =Double.parseDouble(number)/Math.pow(10,count);
            secondNum = secondNum + decimalPart;
            count++;
        }

        return Double.toString(secondNum);
    }
    public void calculateOperation(EditText operationText){
        double result;
        switch (operation){
            case " + ":
                result= firstNum + secondNum;
                break;
            case " - ":
                result= firstNum - secondNum;
                break;
            case " * ":
                result= firstNum * secondNum;
                break;
            case " / ":
                result= firstNum / secondNum;
                break;
            default:
                result = firstNum;
                break;
        }
        operationText.setText(Double.toString(result));
        firstNum = result;
        operation="";
        secondNum=0;
        isSetOperator = false;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton one,two,three,four,five,six,seven,eight,nine,zero,dot,equals,fn,division,multiply,diff,plus,percentage,delete,ac;
        EditText operationText = (EditText) findViewById(R.id.eTOperation);


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

        operationText.setText("0");

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("1"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("1"));
                }

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("2"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("2"));
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!isSetOperator){
                    operationText.setText(addFirstNumber("3"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("3"));
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("4"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("4"));
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("5"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("5"));
                }

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("6"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("6"));
                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("7"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("7"));
                }

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("8"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("8"));
                }

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("9"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("9"));
                }

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSetOperator){
                    operationText.setText(addFirstNumber("0"));
                }else{
                    operationText.setText(firstNum + operation + addSecondNumber("0"));
                }

            }
        });

        /*Tecla decimal*/

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isSetDecimals = true;

            }
        });
        /*TECLAS DE OPERACIONES*/
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSetOperator){
                    calculateOperation(operationText);
                    isSetOperator = true;
                    operation = " + ";
                    operationText.setText(operationText.getText().toString()+ operation);
                }
                else{
                    operation = " + ";
                    count = 1;
                    decimalPart = 0;
                    isSetDecimals = false;
                    operationText.setText(operationText.getText().toString()+ operation);
                    isSetOperator = true;
                }
            }
        });
        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSetOperator){
                    calculateOperation(operationText);
                    isSetOperator = true;
                    operation = " - ";
                    operationText.setText(operationText.getText().toString()+ operation);
                }
                else{
                    operation = " - ";
                    count = 1;
                    decimalPart = 0;
                    isSetDecimals = false;
                    operationText.setText(operationText.getText().toString()+ operation);
                    isSetOperator = true;

                }

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isSetOperator){
                    calculateOperation(operationText);
                    isSetOperator = true;
                    operation = " * ";
                    operationText.setText(operationText.getText().toString()+ operation);
                }
                else{
                    operation = " * ";
                    count = 1;
                    decimalPart = 0;
                    isSetDecimals = false;
                    operationText.setText(operationText.getText().toString()+ operation);
                    isSetOperator = true;
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSetOperator){
                    calculateOperation(operationText);
                    isSetOperator = true;
                    operation = " / ";
                    operationText.setText(operationText.getText().toString()+ operation);
                }
                else{
                    operation = " / ";
                    count = 1;
                    decimalPart = 0;
                    isSetDecimals = false;
                    operationText.setText(operationText.getText().toString()+ operation);
                    isSetOperator = true;
                }
            }
        });

        /*TECLA IGUAL*/
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               calculateOperation(operationText);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                count = 1;
                isSetDecimals = false;
                decimalPart = 0;
                if(!isSetOperator){
                    isSetOperator = true;
                }
                if(secondNum==0){
                    result = firstNum/100;
                    firstNum = result;
                    operationText.setText(Double.toString(result));

                }
                else{
                    result = secondNum/100;
                    secondNum = result;
                    operationText.setText(firstNum + operation + secondNum);

                }

            }
        });

        /*TECLAS EXTRA*/
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 1;
                operation = "";
                decimalPart = 0;
                firstNum =0;
                secondNum=0;
                isSetOperator= false;
                isSetDecimals = false;
                operationText.setText("0");
            }
        });

    }



}