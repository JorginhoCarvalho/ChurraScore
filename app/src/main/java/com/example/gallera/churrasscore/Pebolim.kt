package com.example.gallera.churrasscore

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pebolim.*


class Pebolim : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pebolim)


        btnTruco_P.setOnClickListener {
            val intent = Intent(this, Truco :: class.java)
            startActivity(intent)
        }

        btnFutebol_P.setOnClickListener {
            val intent = Intent(this, Futebol :: class.java)
            startActivity(intent)
        }

        var placarTime1 = 0
        var placarTime2 = 0
        var tvSelect = 0

        tvTime1.setOnClickListener(){
            tvSelect = 0
            tvTime2.setBackgroundColor(Color.WHITE)
            tvTime1.setBackgroundColor(Color.BLUE)
        }

        tvTime2.setOnClickListener(){
            tvTime1.setBackgroundColor(Color.WHITE)
            tvTime2.setBackgroundColor(Color.BLUE)
            tvSelect = 1
        }

        btnAdiciona_P.setOnClickListener(){
            if(tvSelect == 0){
                placarTime1 = placarTime1.inc()
                tvTime1.setText(placarTime1.toString())
            }else{
                placarTime2 = placarTime2.inc()
                tvTime2.setText(placarTime2.toString())
            }

        }

        btnSubtrai_P.setOnClickListener(){
            if(tvSelect == 0) {
                if (placarTime1 != 0) {
                    placarTime1 = placarTime1.dec()
                }
                tvTime1.setText(placarTime1.toString())
            }else{
                if (placarTime2 != 0) {
                    placarTime2 = placarTime2.dec()
                }
                tvTime2.setText(placarTime2.toString())
            }
        }


    }
}
