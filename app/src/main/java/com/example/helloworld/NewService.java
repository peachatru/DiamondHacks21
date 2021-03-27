package com.example.helloworld;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class NewService extends Service {

    private MediaPlayer player;

    public NewService() {
    }

    //this method is triggered by startService() method
    public int onStartCommand(Intent intent, int flags, int startId) {

        //create a media player that plays the default ringtone on loop
        player = MediaPlayer.create( this,
                Settings.System.DEFAULT_RINGTONE_URI );
        player.setLooping( true );
        player.start();
        return START_STICKY;
    }

    // this method is triggered by stopService() method
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }


    @Override
    public IBinder onBind(Intent intent) {
        //this method is triggered by bindService() method of bounded service
        return null;
    }
}





