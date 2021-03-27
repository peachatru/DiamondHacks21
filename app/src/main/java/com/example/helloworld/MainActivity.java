package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get reference of the button
        Button buttonOne = (Button) findViewById(R.id.button3);

        //handle button click action event
        buttonOne.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                launchActivityB();
                //launchBrowser
            }
        });
    }

    private void launchActivityB(){

        //create an explicit intent to launch ActivityB
        Intent i = new Intent(this, ActivityB.class);
        //Intent i = new Intent(this, ServiceDemo.class);
        i.putExtra("KEY", "VALUE");
        startActivity(i);
    }

    private void launchBrowser(){

        //create an implicit intent to launch the web browser
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(i);
    }




}
