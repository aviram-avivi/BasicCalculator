package com.example.myfirstcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    String operator;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);
    }

    public void ButtonClickFunction(View view)
    {
        if (view instanceof Button)
        {
            Button button = (Button) view;
            String str = button.getText().toString();
            result.append(str);
        }
    }

    public void clearAll(View view)
    {
        result.setText("");
    }

    public void mathOperation(View view)
    {
        num1 = Integer.parseInt(result.getText().toString());
        Button button = (Button) view;
        operator = button.getText().toString();
        result.setText("");
    }

    public void equalCalc(View view)
    {
        num2 = Integer.parseInt(result.getText().toString());
        switch (operator)
        {
            case "+":
                result.setText(String.valueOf(num1 + num2));
                break;
            case "-":
                result.setText(String.valueOf(num1 - num2));
                break;
            case "X":
                result.setText(String.valueOf(num1 * num2));
                break;
            case "÷":
                if (num1 % num2 != 0)
                {
                    result.setText(Float.toString((float)num1 / num2));
                    break;
                }
                result.setText(String.valueOf(num1 / num2));
                break;
        }


    }
}