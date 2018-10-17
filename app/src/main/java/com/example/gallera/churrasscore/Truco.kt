package com.example.gallera.churrasscore

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_truco.*

class Truco : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_truco)


        btnPebolim_T.setOnClickListener {
            val intent = Intent(this, Pebolim :: class.java)
            startActivity(intent)
        }

        btnFutebol_T.setOnClickListener() {
            val intent = Intent(this, Futebol :: class.java)
            startActivity(intent)
        }

        var placarTime1 = 0
        var placarTime2 = 0
        var tvSelect = 0
        var vitoriaTime1 = 0
        var vitoriaTime2 = 0
        var winner =

        tvTimeLeft.setOnClickListener(){
            tvSelect = 0
            tvTimeRight.setBackgroundColor(Color.WHITE)
            tvTimeLeft.setBackgroundColor(Color.BLUE)
        }

        tvTimeRight.setOnClickListener(){
            tvTimeLeft.setBackgroundColor(Color.WHITE)
            tvTimeRight.setBackgroundColor(Color.BLUE)
            tvSelect = 1
        }

        btnAdiciona1_T.setOnClickListener(){

            if (tvSelect == 0) {
                placarTime1 = placarTime1 + 1
                if (placarTime1 > 11) {

                    vitoriaTime1 = vitoriaTime1.inc()
                    tvVitoria1.setText("Vitoria: " + vitoriaTime1.toString())
                    tvTimeLeft.setText("0")
                    tvTimeRight.setText("0")
                    placarTime1 = 0
                    placarTime2 = 0
                }
                else
                    tvTimeLeft.setText(placarTime1.toString())
            } else {
                placarTime2 = placarTime2 + 1
                if (placarTime2 > 11) {

                    vitoriaTime2 = vitoriaTime2.inc()
                    tvVitoria2.setText("Vitoria: " + vitoriaTime2.toString())
                    tvTimeLeft.setText("0")
                    tvTimeRight.setText("0")
                    placarTime1 = 0
                    placarTime2 = 0
                }
                else
                    tvTimeRight.setText(placarTime2.toString())
            }
        }

        btnAdiciona3_T.setOnClickListener(){
            if (tvSelect == 0) {
                placarTime1 = placarTime1 + 3
                if (placarTime1 > 11) {

                    vitoriaTime1 = vitoriaTime1.inc()
                    tvVitoria1.setText("Vitoria: " + vitoriaTime1.toString())
                    tvTimeLeft.setText("0")
                    tvTimeRight.setText("0")
                    placarTime1 = 0
                    placarTime2 = 0
                }
                else
                    tvTimeLeft.setText(placarTime1.toString())
            } else {
                placarTime2 = placarTime2 + 3
                if (placarTime2 > 11) {

                    vitoriaTime2 = vitoriaTime2.inc()
                    tvVitoria2.setText("Vitoria: " + vitoriaTime2.toString())
                    tvTimeLeft.setText("0")
                    tvTimeRight.setText("0")
                    placarTime1 = 0
                    placarTime2 = 0
                }
                else
                    tvTimeRight.setText(placarTime2.toString())
            }
        }

        btnAdiciona6_T.setOnClickListener(){
            if (tvSelect == 0) {
                placarTime1 = placarTime1 + 6
                if (placarTime1 > 11) {

                    vitoriaTime1 = vitoriaTime1.inc()
                    tvVitoria1.setText("Vitoria: " + vitoriaTime1.toString())
                    tvTimeLeft.setText("0")
                    tvTimeRight.setText("0")
                    placarTime1 = 0
                    placarTime2 = 0
                }
                else
                    tvTimeLeft.setText(placarTime1.toString())
            } else {
                placarTime2 = placarTime2 + 6
                if (placarTime2 > 11) {

                    vitoriaTime2 = vitoriaTime2.inc()
                    tvVitoria2.setText("Vitoria: " + vitoriaTime2.toString())
                    tvTimeLeft.setText("0")
                    tvTimeRight.setText("0")
                    placarTime1 = 0
                    placarTime2 = 0

                }
                else
                    tvTimeRight.setText(placarTime2.toString())
            }
        }

        btnAdiciona9_T.setOnClickListener() {

                if (tvSelect == 0) {
                    placarTime1 = placarTime1 + 9
                    if (placarTime1 > 11) {

                        vitoriaTime1 = vitoriaTime1.inc()
                        tvVitoria1.setText("Vitoria: " + vitoriaTime1.toString())
                        tvTimeLeft.setText("0")
                        tvTimeRight.setText("0")
                        placarTime1 = 0
                        placarTime2 = 0
                    }
                    else
                        tvTimeLeft.setText(placarTime1.toString())
                } else {
                    placarTime2 = placarTime2 + 9
                    if (placarTime2 > 11) {

                        vitoriaTime2 = vitoriaTime2.inc()
                        tvVitoria2.setText("Vitoria: " + vitoriaTime2.toString())
                        tvTimeLeft.setText("0")
                        tvTimeRight.setText("0")
                        placarTime1 = 0
                        placarTime2 = 0
                    }
                    else
                        tvTimeRight.setText(placarTime2.toString())
                }
        }

            btnAdiciona12_T.setOnClickListener() {
                if (!(placarTime1 > 11 || placarTime2 > 11)) {
                    if (tvSelect == 0) {
                        placarTime1 = placarTime1 + 12
                        tvTimeLeft.setText(placarTime1.toString())
                        if (placarTime1 >= 12) {

                            vitoriaTime1 = vitoriaTime1.inc()
                            tvVitoria1.setText("Vitoria: " + vitoriaTime1.toString())
                            tvTimeLeft.setText("0")
                            tvTimeRight.setText("0")
                            placarTime1 = 0
                            placarTime2 = 0
                        }
                    } else {
                        placarTime2 = placarTime2 + 12
                        tvTimeRight.setText(placarTime2.toString())
                        if (placarTime2 >= 12) {

                            vitoriaTime2 = vitoriaTime2.inc()
                            tvVitoria2.setText("Vitoria: " + vitoriaTime2.toString())
                            tvTimeLeft.setText("0")
                            tvTimeRight.setText("0")
                            placarTime1 = 0
                            placarTime2 = 0
                        }
                    }
                }


            }

            btnSubtrai_T.setOnClickListener() {
                if (tvSelect == 0) {
                    if (placarTime1 != 0) {
                        placarTime1 = placarTime1.dec()
                    }
                    tvTimeLeft.setText(placarTime1.toString())
                } else {
                    if (placarTime2 != 0) {
                        placarTime2 = placarTime2.dec()
                    }
                    tvTimeRight.setText(placarTime2.toString())
                }
            }




        }
    }


