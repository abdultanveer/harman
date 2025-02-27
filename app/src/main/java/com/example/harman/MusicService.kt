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

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"music service destroyed")

    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}