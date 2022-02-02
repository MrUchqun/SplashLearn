package com.example.splashlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        initViews()
    }

    private fun initViews() {
        val tvSignUp: TextView = findViewById(R.id.tv_sign_up)
        tvSignUp.setOnClickListener {
            callSignUpActivity()
        }
    }

    private fun callSignUpActivity() {
        startActivity(Intent(this, SignUpActivity::class.java))
    }
}