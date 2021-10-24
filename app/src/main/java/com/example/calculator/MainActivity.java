package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getNumbers() {
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);

        return true;
    }

    public void doSum(View v) {
        if (getNumbers()) {
            int sum = num1 + num2;
            goToActivity2(sum);
        }
    }

    public void goToActivity2(int num) {
        Intent intent = new Intent(this , MainActivity2.class);
        intent.putExtra("message",num);
        startActivity(intent);
    }

    public void doSub(View v) {
        if (getNumbers()) {
            int sum = num1 - num2;
            goToActivity2(sum);
        }
    }

    public void doMul(View v) {
        if (getNumbers()) {
            int sum = num1 * num2;
            goToActivity2(sum);
        }
    }

    public void doDiv(View v) {

        if (getNumbers()) {
            int sum = num1 / num2;
            goToActivity2(sum);
        }
    }
}