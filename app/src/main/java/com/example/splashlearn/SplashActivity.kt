package com.example.splashlearn

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)
        initViews()
    }

    private fun initViews() {
        callCountDownTimer()
    }

    private fun callCountDownTimer() {
        object : CountDownTimer(2000, 1000) {
            override fun onTick(p0: Long) {

            }
            override fun onFinish() {
                callSignInActivity()
            }
        }.start()
    }

    private fun callSignInActivity() {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}