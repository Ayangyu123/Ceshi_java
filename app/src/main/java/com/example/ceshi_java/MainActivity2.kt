package com.example.ceshi_java

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    val Handler:Handler = TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        init()
        nuont()
    }
    fun init(){
        Toast.makeText(this, "哈哈哈", Toast.LENGTH_SHORT).show()
    }

    fun nuont(){

    }

}