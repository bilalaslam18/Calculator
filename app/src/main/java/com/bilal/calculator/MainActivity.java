package com.bilal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAdd, btnSub, btnMul, btnDiv;
    EditText text1, text2;
    TextView answer;
    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnadd);
        btnSub = findViewById(R.id.btnsub);
        btnMul = findViewById(R.id.btnmul);
        btnDiv = findViewById(R.id.btndiv);
        text1 = findViewById(R.id.num1);
        text2 = findViewById(R.id.num2);
        answer = findViewById(R.id.answer);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        //this is a calculator

    }

    public double getNum(EditText text)
    {
        if (text.getText().toString().equals("")){
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        }
        return Double.parseDouble(text.getText().toString());
    }

    @Override
    public void onClick(View view) {
        num1 = getNum(text1);
        num2 = getNum(text2);

        switch (view.getId()) {
            case R.id.btnadd:
                answer.setText("Answer = " + (num1 + num2));
                break;
            case R.id.btnsub:
                answer.setText("Answer = " + (num1 - num2));
                break;
            case R.id.btnmul:
                answer.setText("Answer = " + (num1 * num2));
                break;
            case R.id.btndiv:
                answer.setText("Answer = " + (num1 / num2));
                break;
        }
    }
}