package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class BroadcastReceiverActivity extends AppCompatActivity {

    MyReceiver br;
    IntentFilter i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);

        br = new MyReceiver();
        i = new IntentFilter("android.intent.action.BATTERY_LOW");

        //register a broadcast receiver that listens through activity lifecycle
        registerReceiver(br,i);
    }
    @Override
    protected void onStart() {
        super.onStart();

        //register a broadcast receiver that listens when activity is in foreground
        //registerReceiver(br,i);
    }
    @Override
    protected void onStop() {
        super.onStop();

        //unregister a broadcast receiver that listens when activity is in foreground
        //unregisterReceiver(br);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        //unregister the broadcast receiver that listens through activity lifecycle
        unregisterReceiver(br);
    }
}