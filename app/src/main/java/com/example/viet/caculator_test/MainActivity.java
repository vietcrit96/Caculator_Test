package com.example.viet.caculator_test;

import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvResult;

    private Button btnClearAll;
    private Button btnRemove1;
    private Button btnPer;
    private Button btnEqual;
    private Button btnDot;

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

    private int tem;
    private float t;
    private float kq;
    boolean checkNew = true;
    private float thamsothu1,thamsothu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickViews();
    }

    private void initWidget() {
        tvResult = findViewById(R.id.tv_result);

        btnClearAll = findViewById(R.id.btn_clearAll);
        btnRemove1 = findViewById(R.id.btn_remove1);
        btnPer = findViewById(R.id.btn_per);
        btnDot = findViewById(R.id.btn_dot);
        btnEqual = findViewById(R.id.btn_equal);
        btnYinyang = findViewById(R.id.btn_yinyang);


        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMulti = findViewById(R.id.btn_multi);
        btnDivi = findViewById(R.id.btn_divi);

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

    public void setEventClickViews() {
        tvResult.setOnClickListener(this);

        btnClearAll.setOnClickListener(this);
        btnRemove1.setOnClickListener(this);
        btnPer.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnYinyang.setOnClickListener(this);
        btnDot.setOnClickListener(this);

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
        switch (v.getId()) {
            case R.id.btn_number0:
                setBtnNumber0();
                break;
            case R.id.btn_number1:
                setBtnNumber1();
                break;
            case R.id.btn_number2:
                setBtnNumber2();
                break;
            case R.id.btn_number3:
                setBtnNumber3();
                break;
            case R.id.btn_number4:
                setBtnNumber4();
                break;
            case R.id.btn_number5:
                setBtnNumber5();
                break;
            case R.id.btn_number6:
                setBtnNumber6();
                break;
            case R.id.btn_number7:
                setBtnNumber7();
                break;
            case R.id.btn_number8:
                setBtnNumber8();
                break;
            case R.id.btn_number9:
                setBtnNumber9();
                break;


            case R.id.btn_plus:
                tem = 1;
                t = Float.parseFloat(tvResult.getText().toString());
                tvResult.setText("0");
                break;
            case R.id.btn_multi:
                tem = 2;
                t = Float.parseFloat(tvResult.getText().toString());
                tvResult.setText("0");
                break;
            case R.id.btn_minus:
                tem = 3;
                t = Float.parseFloat(tvResult.getText().toString());
                tvResult.setText("0");
                break;
            case R.id.btn_divi:
                tem = 4;
                t = Float.parseFloat(tvResult.getText().toString());
                tvResult.setText("0");
                break;


            case R.id.btn_remove1:
                setBtnRemove1();
                break;
            case R.id.btn_clearAll:
                tvResult.setText("0");
                break;
            case R.id.btn_dot:
                setBtnDot();
                break;
            case R.id.btn_per:
//                setBtnPer();
                break;
            case R.id.btn_equal:
                //kho day
                setTvResult();
                break;
            case R.id.btn_yinyang:
                setBtnYinyang();
                break;
        }

    }

//    public void setBtnPer() {
//        tvResult.setText(tvResult.getText().toString() + "%");
//        float t = Float.parseFloat(tvResult.getText().toString());
//        float thamsothu1 =t/100;
////        t=t/100;
////        if (t % (int) t == 0) {
////        }
//// tvResult.setText(tvResult.getText().toString() + "%");
//    }

    public void setBtnRemove1() {
        char[] t = tvResult.getText().toString().toCharArray();
        tvResult.setText(null);
        if (t.length == 1) {
            tvResult.setText("0");
        } else
            for (int i = 0; i < t.length - 1; i++) {
                tvResult.setText(tvResult.getText() + String.valueOf(t[i]));
            }
    }

    public void setBtnYinyang() {
        if (!tvResult.getText().toString().equals("0")) {
            float t = Float.parseFloat(tvResult.getText().toString()) * (-1);
            if (t % (int) t == 0) {
                tvResult.setText(String.valueOf((int) t));
            } else tvResult.setText(String.valueOf(t));
        }
    }

    public void setBtnDot() {
        float t = Float.parseFloat(tvResult.getText().toString());
        if (t == 0) {
            tvResult.setText(tvResult.getText().toString() + ".");
        } else if (t % (int) t == 0) {
            tvResult.setText(tvResult.getText().toString() + ".");
        }
    }

    public void setBtnNumber0() {
        checkNew();
        checkNew = false;
        if (!tvResult.getText().toString().equals("0")) {
            tvResult.setText(tvResult.getText().toString() + "0");
        } else tvResult.setText("0");

    }

    public void setBtnNumber1() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("1");
        } else tvResult.setText(tvResult.getText().toString() + "1");

    }

    public void setBtnNumber2() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("2");
        } else tvResult.setText(tvResult.getText().toString() + "2");

    }

    public void setBtnNumber3() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("3");
        } else tvResult.setText(tvResult.getText().toString() + "3");

    }

    public void setBtnNumber4() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("4");
        } else tvResult.setText(tvResult.getText().toString() + "4");

    }

    public void setBtnNumber5() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("5");
        } else tvResult.setText(tvResult.getText().toString() + "5");

    }

    public void setBtnNumber6() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("6");
        } else tvResult.setText(tvResult.getText().toString() + "6");
    }

    public void setBtnNumber7() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("7");
        } else tvResult.setText(tvResult.getText().toString() + "7");

    }

    public void setBtnNumber8() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("8");
        } else tvResult.setText(tvResult.getText().toString() + "8");

    }

    public void setBtnNumber9() {
        checkNew();
        checkNew = false;
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText("9");
        } else tvResult.setText(tvResult.getText().toString() + "9");

    }

    public void setTvResult() {
        if (tem == 1) {
            kq = t + Float.parseFloat(tvResult.getText().toString());
            if (kq % (int) kq == 0) {
                tvResult.setText(String.valueOf((int) kq));
            } else tvResult.setText(String.valueOf(kq));
            t = kq;
        }
        if (tem == 2) {
            kq = t * Float.parseFloat(tvResult.getText().toString());
            if (kq % (int) kq == 0) {
                tvResult.setText(String.valueOf((int) kq));
            } else tvResult.setText(String.valueOf(kq));
            t = kq;
        }
        if (tem == 3) {
            kq = t - Float.parseFloat(tvResult.getText().toString());
            if (kq % (int) kq == 0) {
                tvResult.setText(String.valueOf((int) kq));
            } else tvResult.setText(String.valueOf(kq));
            t = kq;
        }
        if (tem == 4) {
            kq = t / Float.parseFloat(tvResult.getText().toString());
            if (kq % (int) kq == 0) {
                tvResult.setText(String.valueOf((int) kq));
            } else tvResult.setText(String.valueOf(kq));
            t = kq;
        }
        checkNew = true;

    }

    public void checkNew() {
        if (checkNew) {
            tvResult.setText(null);
        }
    }
}

