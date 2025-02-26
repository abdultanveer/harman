package com.example.harman

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }

    fun clickHandler(view: View) {
        val cl :ConstraintLayout = findViewById(R.id.constraintlyt)
        Snackbar.make(cl,"button was clicked",Snackbar.LENGTH_SHORT).show()
    }
}