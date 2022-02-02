package com.example.splashlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        initViews()
    }

    private fun initViews() {
        val tvSignUp: TextView = findViewById(R.id.tv_sign_in)
        tvSignUp.setOnClickListener {
            callSignUpActivity()
        }
    }

    private fun callSignUpActivity() {
        startActivity(Intent(this, SignInActivity::class.java))
    }
}