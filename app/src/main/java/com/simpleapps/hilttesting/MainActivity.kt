package com.simpleapps.hilttesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.simpleapps.hilttesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var view: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)
    }
}