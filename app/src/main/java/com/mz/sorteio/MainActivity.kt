package com.mz.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortNumber(view: View){
        var footerLabel = findViewById<TextView>(R.id.text_resultado)
        var randomNumberToTen = Random.nextInt(11);
        footerLabel.setText("O número sorteado é $randomNumberToTen")
    }
}