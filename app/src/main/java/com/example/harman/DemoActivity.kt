package com.example.harman

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

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
}