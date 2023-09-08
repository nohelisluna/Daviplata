package com.example.daviplata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daviplata.databinding.ActivityMain2Binding
import java.util.regex.Pattern

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnIngresar.setOnClickListener{
            cambiarActivity()
        }
    }
    fun cambiarActivity(){
            startActivity(Intent(this, MainActivity3::class.java))
    }
}