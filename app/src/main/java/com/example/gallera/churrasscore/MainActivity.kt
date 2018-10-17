package com.example.gallera.churrasscore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTruco.setOnClickListener {
            val intent = Intent(this, Truco::class.java)
            startActivity(intent)
        }

        btnFutebol.setOnClickListener {
            val intent = Intent(this, Futebol::class.java)
            startActivity(intent)
        }

        btnPebolim.setOnClickListener {
            val intent = Intent(this, Pebolim::class.java)
            startActivity(intent)
        }


    }
}
