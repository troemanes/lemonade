package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tree:ImageView = findViewById(R.id.imageView)
        val text1:TextView = findViewById(R.id.textView)

        val texts = listOf("Click to juice Lemon!", "Click to drink your Lemonade!", "Click to start again!","Click to select a lemon!")
        var currentIndex = 0

        val images = listOf(R.drawable.lemon,R.drawable.lemonade,R.drawable.emptydrink,R.drawable.lemontree)
        var currentImage = 0

        tree.setOnClickListener {
            text1.text = texts[currentIndex]
            currentIndex = (currentIndex + 1) % texts.size

            tree.setImageResource(images[currentImage])
            currentImage = (currentImage + 1) % images.size
        }
    }
}