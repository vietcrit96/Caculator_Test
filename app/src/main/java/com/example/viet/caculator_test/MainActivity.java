package com.example.viet.caculator_test;

import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvNumber;
    private TextView tvResult;

    private Button btnClear;
    private Button btnRemove;
    private Button btnPer;
    private Button btnDot;
    private Button btnEqual;

    private Button btnDivi;
    private Button btnMulti;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnYinyang;

    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickViews();
    }

    private void initWidget() {
        tvNumber = findViewById(R.id.tv_number);
        tvResult = findViewById(R.id.tv_result);

        btnClear = this.findViewById(R.id.btn_clear);
        btnRemove = this.findViewById(R.id.btn_remove);
        btnPer = this.findViewById(R.id.btn_per);
        btnDot = this.findViewById(R.id.btn_dot);
        btnEqual = this.findViewById(R.id.btn_equal);
        btnYinyang = this.findViewById(R.id.btn_yinyang);


        btnPlus = this.findViewById(R.id.btn_plus);
        btnMinus = this.findViewById(R.id.btn_minus);
        btnMulti = this.findViewById(R.id.btn_multi);
        btnDivi = this.findViewById(R.id.btn_divi);

        btnNumber0 = findViewById(R.id.btn_number0);
        btnNumber1 = findViewById(R.id.btn_number1);
        btnNumber2 = findViewById(R.id.btn_number2);
        btnNumber3 = findViewById(R.id.btn_number3);
        btnNumber4 = findViewById(R.id.btn_number4);
        btnNumber5 = findViewById(R.id.btn_number5);
        btnNumber6 = findViewById(R.id.btn_number6);
        btnNumber7 = findViewById(R.id.btn_number7);
        btnNumber8 = findViewById(R.id.btn_number8);
        btnNumber9 = findViewById(R.id.btn_number9);
        }
    public void setEventClickViews(){
        tvNumber.setOnClickListener(this);
        tvResult.setOnClickListener(this);

        btnClear.setOnClickListener(this);
        btnRemove.setOnClickListener(this);
        btnPer.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnYinyang.setOnClickListener(this);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivi.setOnClickListener(this);

        btnNumber0.setOnClickListener(this);
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_number0:
                tvNumber.getText();
            case R.id.btn_number1:
            case R.id.btn_number2:
            case R.id.btn_number3:
            case R.id.btn_number4:
            case R.id.btn_number5:
            case R.id.btn_number6:
            case R.id.btn_number7:
            case R.id.btn_number8:
            case R.id.btn_number9:
        }
    }
}

