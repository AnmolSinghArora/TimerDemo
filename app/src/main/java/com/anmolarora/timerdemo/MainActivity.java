package com.anmolarora.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //countdown from 10 to 0
        new CountDownTimer(10000,1000){

            public void onTick(long millisecondsUntilDone){//everytime we get a tick, i.e. every second here(1000 msec)

                //Counter is counting down(Every second)
                Log.i("Seconds left", String.valueOf(millisecondsUntilDone/1000));
            }
            public void onFinish(){

                //Counter is finished(After 10 seconds)
                Log.i("Done","Countdown Timer Finished");
            }
        }.start();

/*
        final Handler handler = new Handler(); // handler allows chunks of code to be run in delayed manner
        Runnable run = new Runnable() {
            @Override
            public void run() {

                //insert code to be run every second

                Log.i("Runnable has run","a second must have passed...");

                handler.postDelayed(this, 1000);//"this" refers to the run method here

            }
        };

        handler.post(run);
*/
    }

}
