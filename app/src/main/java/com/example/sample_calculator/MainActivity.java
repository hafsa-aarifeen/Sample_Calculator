package com.example.sample_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText firstnum; // private kattayam illai.use panninal nallam
    private EditText secondnum;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView ans;
    private TextView ans2;
    private TextView ans3;
    private TextView ans4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnum =(EditText) findViewById(R.id.textNum1); // R for resource file & id for findbyid
        secondnum=(EditText) findViewById(R.id.textNum2);
        add =(Button)  findViewById(R.id.btnAdd);
        sub =(Button)  findViewById(R.id.btnSub);
        mul =(Button)  findViewById(R.id.btnMul);
        div =(Button)  findViewById(R.id.btnDiv);
        ans=findViewById(R.id.textResult);
        ans2=findViewById(R.id.textResult2);
        ans3=findViewById(R.id.textResult3);
        ans4=findViewById(R.id.textResult4);

    }
    // Addition
    public void Addition(View view) {
        int num1 = Integer.parseInt(firstnum.getText().toString());
        int num2 = Integer.parseInt(secondnum.getText().toString());
        int result = num1 + num2;
        ans.setText("Result is " +result);

    }
    // Substraction
    public void Substraction(View view) {
        int num1 = Integer.parseInt(firstnum.getText().toString());
        int num2 = Integer.parseInt(secondnum.getText().toString());
        int result = num1 - num2;
        ans2.setText("Result is " +result);

    }
    // Multiplication
    public void Multiplication(View view) {
        int num1 = Integer.parseInt(firstnum.getText().toString());
        int num2 = Integer.parseInt(secondnum.getText().toString());
        int result = num1 * num2;
        ans3.setText("Result is " +result);

    }
    // Division
    public void Division(View view) {
        int num1 = Integer.parseInt(firstnum.getText().toString());
        int num2 = Integer.parseInt(secondnum.getText().toString());
        float result = num1 / num2;
        ans4.setText("Result is " +result);

    }
}