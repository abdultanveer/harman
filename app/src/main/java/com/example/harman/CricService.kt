package com.example.harman

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import java.util.Random


/**
 * give u cricket score
 */
class CricService : Service() {
    private val mGenerator = Random()


    private val binder = LocalBinder()

    inner class LocalBinder : Binder() {
        // Return this instance of LocalService so clients can call public methods.
        fun getService(): CricService = this@CricService  //6
    }

    fun addNos(x:Int,y:Int):Int{
        return x + y
    }

    val currCricScore: Int
        get() = mGenerator.nextInt(100)

    override fun onBind(intent: Intent): IBinder {  //2
        return binder//3
    }
}