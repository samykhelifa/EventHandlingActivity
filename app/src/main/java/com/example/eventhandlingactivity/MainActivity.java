package com.example.eventhandlingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = findViewById(R.id.relativeLayout);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Log.i(TAG,"button clicked");
        final int b1 = R.id.button1;
        final int b2 = R.id.button2;
        switch (view.getId()) {
            case b1:
                Log.i(TAG, "button one clicked");
                relativeLayout.setBackgroundColor(Color.GREEN);
                break;
            case b2:
                Log.i(TAG, "button two clicked");
                relativeLayout.setBackgroundColor(Color.RED);
                break;
        }
    }
}

