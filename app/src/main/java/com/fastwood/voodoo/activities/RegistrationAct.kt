package com.fastwood.voodoo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fastwood.voodoo.MainActivity
import com.fastwood.voodoo.R

class RegistrationAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    fun login(view: View) {
        val intent = Intent ( this@RegistrationAct, LoginAct::class.java)
        startActivity(intent)
    }

    fun mainActivity(view: View) {
        val intent = Intent ( this@RegistrationAct, MainActivity::class.java)
        startActivity(intent)
    }
}