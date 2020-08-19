package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class FirstActivity extends AppCompatActivity {

     private
     Button button1;
     EditText etn1 , etn2;
     String n1 , n2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        etn1 = findViewById(R.id.etn12);
        etn2 = findViewById(R.id.etn23);


        button1 = (Button)findViewById(R.id.button12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (FirstActivity.this, SecoundActivity.class);

                n1 = etn1.getText().toString();
                intent.putExtra("Value1",n1);
                n2 = etn2.getText().toString();
                intent.putExtra("Value2",n2);
                startActivity(intent);
                finish();


                Toast toast = Toast.makeText(getApplicationContext(), "You just clicked the Ok button", Toast.LENGTH_SHORT);
                toast.show();




            }
        });
    }


    }


