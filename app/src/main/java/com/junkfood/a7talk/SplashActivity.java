package com.junkfood.a7talk;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private static final String TAG = "SplashActivity";

    private int duration = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        // Loading page Duration : 2 second
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                finish();
            }
        }, duration);
    }
}
