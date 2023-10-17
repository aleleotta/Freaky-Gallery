package com.example.freakygallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freakygallery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val mainBinding = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)
    }
}