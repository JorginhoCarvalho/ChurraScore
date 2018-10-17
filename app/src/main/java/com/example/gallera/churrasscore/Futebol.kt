package com.example.gallera.churrasscore

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_futebol.*


class Futebol : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    private var progressiveView: TextView? = null
    private var seekbarView: SeekBar? = null

    var min = 0
    var max = 60
    var step = 1


    /*private val mSeekbarUpdateHandler = Handler()
    private val mUpdateSeekbar = object : Runnable {
        override fun run() {
            seekBar.setProgress(1)
            mSeekbarUpdateHandler.postDelayed(this, 50)
        }
    }*/

    override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
        val progress_custom = min + (progress * step)
        progressiveView!!.text = progress_custom.toString()
    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {
        //mSeekbarUpdateHandler.postDelayed(mUpdateSeekbar, 0)


    }

    override fun onStopTrackingTouch(seekBar: SeekBar) {
        //mSeekbarUpdateHandler.removeCallbacks(mUpdateSeekbar);
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol)

        btnTruco_F.setOnClickListener {
            val intent = Intent(this, Truco :: class.java)
            startActivity(intent)
        }
        btnPebolim_F.setOnClickListener {
            val intent = Intent(this, Futebol :: class.java)
            startActivity(intent)
        }

        progressiveView = this.tempo
        seekbarView = this.seekBar

        seekbarView!!.max = (max - min) / step

        seekbarView!!.setOnSeekBarChangeListener(this)


        var placarCCamisa = 0
        var placarSCamisa = 0
        var tvSelect = 0

        tvComCamisa.setOnClickListener(){
            tvSelect = 0
            tvSemCamisa.setBackgroundColor(Color.WHITE)
            tvComCamisa.setBackgroundColor(Color.BLUE)
        }

        tvSemCamisa.setOnClickListener(){
            tvComCamisa.setBackgroundColor(Color.WHITE)
            tvSemCamisa.setBackgroundColor(Color.BLUE)
            tvSelect = 1
        }

        btnAdiciona.setOnClickListener(){
            if(tvSelect == 0){
                placarCCamisa = placarCCamisa.inc()
                tvComCamisa.setText(placarCCamisa.toString())
            }else{
                placarSCamisa = placarSCamisa.inc()
                tvSemCamisa.setText(placarSCamisa.toString())
            }

        }

        btnSubtrai.setOnClickListener(){
            if(tvSelect == 0) {
                if (placarCCamisa != 0) {
                    placarCCamisa = placarCCamisa.dec()
                }
                tvComCamisa.setText(placarCCamisa.toString())
            }else{
                if (placarSCamisa != 0) {
                    placarSCamisa = placarSCamisa.dec()
                }
                tvSemCamisa.setText(placarSCamisa.toString())
            }
        }

        /*btnPlay.setOnClickListener {
            onStartTrackingTouch(seekBar)
        }

        btnPause.setOnClickListener {
            onStopTrackingTouch(seekBar)
        }*/



    }


}
