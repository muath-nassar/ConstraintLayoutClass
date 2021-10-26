package com.example.layouts1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isFavorite = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageButton.setOnClickListener {
            if (isFavorite){
                imageButton.setImageResource(R.drawable.ic_baseline_favorite_border_24)
            }else{
                imageButton.setImageResource(R.drawable.ic_baseline_favorite_24)
            }
            isFavorite = !isFavorite
        }
    button.setOnClickListener {
        Toast.makeText(this, "Share now", Toast.LENGTH_SHORT).show()
    }
        button2.setOnClickListener {
            val name = editTextTextPersonName.text.toString()
            var text = textView4.text.toString()
            text += "\n$name"
            textView4.text = text
        }
    }
}