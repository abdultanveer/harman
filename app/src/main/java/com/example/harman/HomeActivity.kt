package com.example.harman

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity() {
    lateinit var tipTv:TextView
    lateinit var amountet:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tipTv = findViewById(R.id.tvTip)
        amountet = findViewById(R.id.etAmount)
    }

    fun clickHandler(view: View) {
        val cl :ConstraintLayout = findViewById(R.id.constraintlyt)
        Snackbar.make(cl,"button was clicked",Snackbar.LENGTH_SHORT).show()
        var amount = amountet.text.toString()
        tipTv.text = amount
    }
}