package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

     Button btnroll;
     ImageView diceleft;
     ImageView diceright;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnroll= findViewById(R.id.btnroll);
      diceleft=findViewById(R.id.diceleft);
         diceright= findViewById(R.id.diceright);

        final int [] dicenumbers =new int[] {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        btnroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rm = new Random();
                int numbers = rm.nextInt(6);
               Log.d("Dicee", "The number is " + numbers );
                diceleft.setImageResource(dicenumbers[numbers]);
                numbers = rm.nextInt(6);
               diceright.setImageResource(dicenumbers[numbers]);
            }
        });

        }


    }

