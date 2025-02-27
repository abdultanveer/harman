package com.example.harman

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MusicService : Service() {
var TAG = MusicService::class.java.simpleName

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG,"music service created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
         super.onStartCommand(intent, flags, startId)

        var imgUrl = intent?.extras?.getString("url")
        Log.i(TAG,"url is "+imgUrl)

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"music service destroyed")

    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}