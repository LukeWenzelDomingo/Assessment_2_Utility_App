package com.example.dino_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val start_btn = findViewById<Button>(R.id.start)

        start_btn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val instruction = findViewById(R.id.instruction) as ImageButton
        instruction.setOnClickListener {
            val inflater = layoutInflater
            val view = inflater.inflate(R.layout.pop_up, null)
            val builder = AlertDialog.Builder(this)
            builder.setView(view)
            builder.setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
            builder.show()
        }







    }
}