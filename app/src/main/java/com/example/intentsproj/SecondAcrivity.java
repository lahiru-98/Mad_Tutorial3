package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondAcrivity extends AppCompatActivity {

    private EditText showNumber1,showNumber2;
    private TextView Answer;

    private String number1,number2,result_Answer;

    private double num1,num2; //for calculations

    private Button AddButton,SubstractButton,MultiplyButton,DivideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acrivity);

        showNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        showNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        AddButton = (Button) findViewById(R.id.btnAdd);
        SubstractButton = (Button) findViewById(R.id.btnSubstract);
        MultiplyButton = (Button) findViewById(R.id.btnMultiply);
        DivideButton = (Button) findViewById(R.id.btndivide);
        Answer = (TextView) findViewById(R.id.txtAnswer);

        //getting intetntExtras
        number1 = getIntent().getStringExtra("number1");
        number2 = getIntent().getStringExtra("number2");

        //converting to Double
        num1 = Double.parseDouble(number1);
        num2 = Double.parseDouble(number2);

        showNumber1.setText(number1);
        showNumber2.setText(number2);


    }

    @Override
    protected void onResume() {
        super.onResume();


            AddButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    double result = num1+num2;
                    //rendering the answer text
                    result_Answer =num1+" + "+num2+" = "+result;
                    Answer.setText(result_Answer);
                }
            });


            SubstractButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double result = num1-num2;
                    //rendering the answer text
                    result_Answer =num1+" - "+num2+" = "+ result;
                    Answer.setText(result_Answer);
                }
            });

            MultiplyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double result = num1*num2;
                    //rendering the answer text
                    result_Answer =num1+" * "+num2+" = "+ result;
                    Answer.setText(result_Answer);
                }
            });

            DivideButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double result = num1/num2;
                    //rendering the answer text
                    result_Answer =num1+" / "+num2+" = "+ result;
                    Answer.setText(result_Answer);
                }
            });



    }
}