package com.example.eventhandlingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    RelativeLayout relativeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = findViewById(R.id.relativeLayout);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"bgd is green");
                relativeLayout.setBackgroundColor(Color.GREEN);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"bgd is red");
                relativeLayout.setBackgroundColor(Color.RED);
            }
        });
    }


}

