package com.example.harman

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DemoActivity : AppCompatActivity() {

    private lateinit var mService: CricService
    lateinit var scoretv:TextView
    //im not invoking the constructor of cricscore service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        scoretv = findViewById(R.id.textView)

    }



    fun startMusicService(view: View) {
        var mIntent = Intent(this,MusicService::class.java)
        mIntent.putExtra("url","https://imgdownlo.com")
        startService(mIntent)
      //  stopService(mIntent)
    }

    fun stopMusicService(view: View) {
        var mIntent = Intent(this,MusicService::class.java)

         stopService(mIntent)

    }

    fun getScore(view: View) {
        var cIntent = Intent(this,CricService::class.java)

        bindService(cIntent,connection, BIND_AUTO_CREATE)//1
    }

    private val connection = object : ServiceConnection {

        override fun onServiceConnected(className: ComponentName, service: IBinder) {
            // We've bound to LocalService, cast the IBinder and get LocalService instance.
            val binder = service as CricService.LocalBinder//4
            mService = binder.getService()//5
          var score =  mService.currCricScore
            scoretv.setText("current score is "+score)
        }

        override fun onServiceDisconnected(arg0: ComponentName) {
        }
    }

}