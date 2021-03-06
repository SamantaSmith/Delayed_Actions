package com.example.cooltimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountDownTimer myTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                Log.d("myTimer", String.valueOf(millisUntilFinished/1000) + " Left");
            }

            @Override
            public void onFinish() {

                Log.d("myTimer", "Timer Finished");
            }
        };

        myTimer.start();


    }
}
