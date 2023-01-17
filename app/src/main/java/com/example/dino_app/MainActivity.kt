package com.example.dino_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val home = findViewById<ImageView>(R.id.home1)
        home.setOnClickListener {
            startActivity(Intent(this, Splash_Screen::class.java)) }

        val back = findViewById<ImageView>(R.id.back1)
        back.setOnClickListener {
            startActivity(Intent(this, Splash_Screen::class.java)) }

        val dino1 = findViewById(R.id.air_dino) as ImageButton
        val t1 = findViewById(R.id.title_6) as TextView
        dino1.setOnClickListener {
           tts = TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
             if (it == TextToSpeech.SUCCESS)
             {
                 tts.language= Locale.UK
                 tts.setSpeechRate(1.05f)
                 tts.speak(title_6.text.toString(), TextToSpeech.QUEUE_ADD, null)
             }
           })
        }

        val dino2 = findViewById(R.id.land_dino) as ImageButton
        val t2 = findViewById(R.id.title_4) as TextView
        dino2.setOnClickListener {
            tts = TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if (it == TextToSpeech.SUCCESS)
                {
                    tts.language= Locale.UK
                    tts.setSpeechRate(1.05f)
                    tts.speak(title_4.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }

        val dino3 = findViewById(R.id.water_dino) as ImageButton
        val t3 = findViewById(R.id.title_3) as TextView
        dino3.setOnClickListener {
            tts = TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if (it == TextToSpeech.SUCCESS)
                {
                    tts.language= Locale.UK
                    tts.setSpeechRate(1.05f)
                    tts.speak(title_3.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }

        val dino4 = findViewById(R.id.land_dino3) as ImageButton
        val t4 = findViewById(R.id.title_2) as TextView
        dino4.setOnClickListener {
            tts = TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if (it == TextToSpeech.SUCCESS)
                {
                    tts.language= Locale.UK
                    tts.setSpeechRate(1.05f)
                    tts.speak(title_2.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }

        val dino5 = findViewById(R.id.land_dino4) as ImageButton
        val t5 = findViewById(R.id.title_5) as TextView
        dino5.setOnClickListener {
            tts = TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if (it == TextToSpeech.SUCCESS)
                {
                    tts.language= Locale.UK
                    tts.setSpeechRate(1.05f)
                    tts.speak(title_5.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }

        val dino6 = findViewById(R.id.land_dino2) as ImageButton
        val t6 = findViewById(R.id.title_1) as TextView
        dino6.setOnClickListener {
            tts = TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if (it == TextToSpeech.SUCCESS)
                {
                    tts.language= Locale.UK
                    tts.setSpeechRate(1.05f)
                    tts.speak(title_1.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }

    }
}