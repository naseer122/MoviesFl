package com.vpn.touchvpn.moviesflix

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.database.database
import com.google.firebase.firestore.firestore

class SplashActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var data = Firebase.firestore
        var ref = data.collection("appversion")
        ref.get().addOnSuccessListener {
            var version = it.documents.get(0).get("version").toString()
            if (version.equals("OK")){
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }, 2000)
            }
        }


    }
}