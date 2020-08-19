package com.example.intentsproj;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class SecoundActivity extends AppCompatActivity {

    EditText etn1, etn2;
    String n1, n2;
    TextView ans;

    private Button buttonP, buttonM, buttonMulti, buttonD;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        buttonP = findViewById(R.id.btnPlus);
        buttonM = findViewById(R.id.btnMin);
        buttonMulti = findViewById(R.id.btnMulti);
        buttonD = findViewById(R.id.btnDiv);
        ans = findViewById(R.id.textViewAns);



        etn1 = findViewById(R.id.editTextNumber1);
        etn2= findViewById(R.id.editTextNumber2);


        n1 = getIntent().getExtras().getString("Value1");
        etn1.setText(n1);
        n2 = getIntent().getExtras().getString("Value2");
        etn2.setText(n2);



        buttonP.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                int number1 = Integer.parseInt(etn1.getText().toString());
                int number2 = Integer.parseInt(etn2.getText().toString());

               int answer = number1 + number2;

               ans.setText(n1 + " + " + n2 + " = " + Integer.toString(answer));

            }

        });



        buttonM.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override

            public void onClick(View v) {

                int number1 = Integer.parseInt(etn1.getText().toString());
                int number2 = Integer.parseInt(etn2.getText().toString());

                int answer = number1 - number2;

                ans.setText(n1 + " - " + n2 + " = " + Integer.toString(answer));

            }

        });



        buttonMulti.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override

            public void onClick(View v) {

                int number1 = Integer.parseInt(etn1.getText().toString());
                int number2 = Integer.parseInt(etn2.getText().toString());

                int answer = number1 * number2;

                ans.setText(n1 + " * " + n2 + " = " + Integer.toString(answer) );

            }

        });



        buttonD.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override

            public void onClick(View v) {

                int number1 = Integer.parseInt(etn1.getText().toString());
                int number2 = Integer.parseInt(etn2.getText().toString());



                int answer = number1 / number2;



                ans. setText(n1 + " / " + n2 + " = " + Integer.toString(answer));

            }

        });

    }

}



