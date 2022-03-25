package com.example.kotlincoroutinestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.kotlincoroutinestest.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import java.io.IOException
import java.lang.Exception
import java.lang.NullPointerException
import java.net.UnknownHostException

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnThrowUnknownHostException.setOnClickListener {
            lifecycleScope.launch {
                throw UnknownHostException()
            }
        }
        binding.btnThrowException.setOnClickListener {
            lifecycleScope.launch {
                throw Exception()
            }
        }
        binding.btnThrowIoException.setOnClickListener {
            lifecycleScope.launch {
                throw IOException()
            }
        }
        binding.btnThrowNullPointerException.setOnClickListener {
            lifecycleScope.launch {
                throw NullPointerException()
            }
        }
    }
}