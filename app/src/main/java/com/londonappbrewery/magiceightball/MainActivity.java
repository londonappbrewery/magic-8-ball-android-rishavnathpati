package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton;
        askButton=findViewById(R.id.ask_button);
        final ImageView ballImage=findViewById(R.id.image_balls);
        final int[] ballArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        askButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Random randomNumber= new Random();
                int number= randomNumber.nextInt(5);
                ballImage.setImageResource(ballArray[number]);
            }
        });
    }
}
