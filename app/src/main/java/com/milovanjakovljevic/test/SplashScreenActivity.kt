package com.milovanjakovljevic.test

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val isOldSplashEnabled = resources.getBoolean(R.bool.old_splash_enabled)
        val isNewSplashEnabled = resources.getBoolean(R.bool.new_splash_enabled)

        if (isNewSplashEnabled && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            startActivity(Intent(this, NewSplashActivity::class.java))
        } else if (isOldSplashEnabled) {
            startActivity(Intent(this, OldSplashScreenActivity::class.java))
        } else {
            startActivity(Intent(this, MainActivity::class.java))
        }

        finish()
    }
}