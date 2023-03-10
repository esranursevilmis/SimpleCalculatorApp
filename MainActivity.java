package com.esranursevilmis.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text=findViewById(R.id.number1Text);
        number2Text=findViewById(R.id.number2Text);
        resultText=findViewById(R.id.result);
    }
    public void sum(View view){
        if(number1Text.getText().toString().equals("")||number2Text.getText().toString().equals("")){
            resultText.setText("Enter number!");
        }
else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;
            resultText.setText("Result: " + result);
        }


    }
    public void deduct(View view){
        if(number1Text.getText().toString().equals("")||number2Text.getText().toString().equals("")){
            resultText.setText("Enter number!");
        }
        else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }
    }
    public void multiply(View view){
        if(number1Text.getText().toString().equals("")||number2Text.getText().toString().equals("")){
            resultText.setText("Enter number!");
        }
        else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }
    }
    public void divide(View view){
        if(number1Text.getText().toString().equals("")||number2Text.getText().toString().equals("")){
            resultText.setText("ENTER NUMBER!");
        }
        else if(number2Text.getText().toString().equals("0")){
            resultText.setText("DIVISION CANNOT BE '0'");
        }
        else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 / number2;
            resultText.setText("Result: " + result);
        }
    }
}