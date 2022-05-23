package com.fastwood.voodoo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fastwood.voodoo.R

class LoginAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun register(view: View) {
        val intent = Intent ( this@LoginAct, RegistrationAct::class.java)
        startActivity(intent)
    }

    fun mainActivity(view: View) {
        val intent = Intent ( this@LoginAct, RegistrationAct::class.java)
        startActivity(intent)
    }
}