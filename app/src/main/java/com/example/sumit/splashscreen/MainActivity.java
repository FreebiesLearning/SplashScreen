package com.example.sumit.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds
                    sleep(5000);


                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);

                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();

    }

}
