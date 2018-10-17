package com.example.gallera.churrasscore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        GlideApp.with(this)
                .load("https://banner2.kisspng.com/20180423/viq/kisspng-smiley-emoji-emoticon-face-text-messaging-delicious-meat-5ade8a058d4786.1841732615245337655787.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .into(imgLogoApp)

        Handler().postDelayed({
            var churrascore = Intent(this, MainActivity::class.java)
            startActivity(churrascore)
            finish()

        }, 2000 )
    }
}
