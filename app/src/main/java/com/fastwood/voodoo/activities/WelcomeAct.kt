package com.fastwood.voodoo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.fastwood.voodoo.R

class WelcomeAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_welcome)
    }

    fun register(view: View) {
        startActivity(Intent (this, RegistrationAct::class.java))
    }

    fun login(view: View) {
        startActivity(Intent (this, LoginAct::class.java))
    }
}