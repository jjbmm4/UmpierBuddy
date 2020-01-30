package com.example.umpirebuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int strikeCount = 0;
    private int ballCount = 0;
    Button StrikeButton, BallButton, ExitButton, ResetButton;
    TextView BallText, StrikeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrikeButton = (Button)findViewById(R.id.StrikeButton);
        StrikeText = (TextView) findViewById(R.id.StrikeText);
        BallButton = (Button)findViewById(R.id.BallButton);
        BallText = (TextView) findViewById(R.id.BallText);
        ExitButton = (Button)findViewById(R.id.ExitButton);
        ResetButton = (Button)findViewById(R.id.ResetButton);


        StrikeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                strikeCount ++;
                StrikeText.setText(Integer.toString(strikeCount));
            }
        });
        BallButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ballCount ++;
                BallText.setText(Integer.toString(ballCount));
            }
        });
        ResetButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strikeCount = 0;
                ballCount = 0;
                StrikeText.setText(Integer.toString(strikeCount));
                BallText.setText(Integer.toString(ballCount));
            }
        });
        ExitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.exit(0);
            }
        });




    }


}
