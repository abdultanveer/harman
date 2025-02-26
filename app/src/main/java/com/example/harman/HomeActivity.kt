package com.example.harman

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.harman.kotlinexs.Student
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity() {
    lateinit var tipTv:TextView
    lateinit var amountet:EditText
var TAG = HomeActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.i(TAG,"created")
        tipTv = findViewById(R.id.tvTip)
        amountet = findViewById(R.id.etAmount)
        //var myStudent:Student = Student("abdul",123,123,true)
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG,"started -get location updates")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG,"resumed-restore email draft")

    }

    override fun onPause() {
        super.onPause()
        Log.w(TAG,"paused-store data/state")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"stopped-write data")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"destroyed--releasing resources")

    }



    fun clickHandler(view: View) {
        val cl :ConstraintLayout = findViewById(R.id.constraintlyt)
        Snackbar.make(cl,"button was clicked",Snackbar.LENGTH_SHORT).show()
        var amount = amountet.text.toString()
        tipTv.text = amount
    }

    fun handleStart(view: View) {
        var sIntent:Intent = Intent(this,MainActivity::class.java)//expplicit inttent
        sIntent.putExtra("tech","android at harman")
        startActivity(sIntent)
    }

    fun handleDial(view: View) {
        var dIntent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:9876543"))//implicit intent
        startActivity(dIntent)
    }
}