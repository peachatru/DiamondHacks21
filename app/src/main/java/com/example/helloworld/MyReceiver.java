package com.example.helloworld;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        //handle what happens when the broadcast event is triggered, we simply show a toast here
        Toast.makeText(context, "Broadcast Detected.", Toast.LENGTH_LONG).show();
    }
}







