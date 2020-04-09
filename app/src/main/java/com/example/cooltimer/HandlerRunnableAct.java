package com.example.cooltimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class HandlerRunnableAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_runnable);

        final Handler handler = new Handler();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                Log.d("Runnabl3", "5 cm in second");
                handler.postDelayed(this, 1000);
            }
        };

        handler.post(runnable);
    }
}
