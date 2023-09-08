package com.example.daviplata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.daviplata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        timer()
    }

    fun timer(){
        var time=  2
        var tiempo = object : CountDownTimer(2000,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.txtTiempo.text="$time"
                time--
            }
            override fun onFinish() {
                startActivity(Intent(this@MainActivity, MainActivity4 ::class.java))
            }
        }
        tiempo.start()
    }
}