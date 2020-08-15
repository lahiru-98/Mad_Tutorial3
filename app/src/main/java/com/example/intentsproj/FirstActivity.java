package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText number1,number2;
    private Button btnOK;

    private String number1Value;
    private String number2Value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        number1 = (EditText) findViewById(R.id.editTextNumber1);
        number2 = (EditText) findViewById(R.id.editTextNumber2);
        btnOK = (Button) findViewById(R.id.btnOK);


    }

    @Override
    protected void onResume() {
        super.onResume();


        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondAcrivity.class);

                //getting input vlauue
                number1Value = number1.getText().toString();
                number2Value = number2.getText().toString();

                //passing the details
                intent.putExtra("number1",number1Value);
                intent.putExtra("number2",number2Value);

                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Sending...", Toast.LENGTH_SHORT).show();


                //Displaying Custom Toast MEssage
                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.custom_toast_layout));

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();
            }
        });
    }
}