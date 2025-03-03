package com.example.harman

import androidx.lifecycle.ViewModel

class DemoViewmodel:ViewModel() {

    var count = 0

   fun incrementCount(){
       count++
   }
}