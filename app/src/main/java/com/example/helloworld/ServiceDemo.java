package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceDemo extends AppCompatActivity {

    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_demo);

        start = (Button) findViewById( R.id.startButton );
        stop = (Button) findViewById( R.id.stopButton );
        final Intent service = new Intent(this,
                NewService.class);


        //setting an onclicklistener for Start button
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startService(service );
            }
        });

        //setting an onclicklistener for Stop button
        stop.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                stopService(service);
            }
        });

    }


}