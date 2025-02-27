package com.example.harman

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
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

    fun showNotification(view: View) {

        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)


        var builder = NotificationCompat.Builder(this, "CHANNEL_ID")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("harman")
            .setContentText("android auto")
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        createNotificationChannel()
        val notificationManager: NotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(234,builder.build())

        //notify(NOTIFICATION_ID, builder.build())

    }


    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is not in the Support Library.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "trip related"
                //getString(R.string.channel_name)
            val descriptionText = "regarding your upcoming trips"
                //getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("CHANNEL_ID", name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system.
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}