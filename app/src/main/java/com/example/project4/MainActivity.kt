package com.example.project4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener{ calculateLife() }

    }
    fun calculateLife(){
        val stringInTextField = binding.num.text.toString()
        val people = stringInTextField.toDouble()
        var totalNum= people * 1.25
        val roundedNum= kotlin.math.ceil(totalNum)
        binding.totalLifeBoats.text = getString(R.string.total_lifeboat, roundedNum)
    }
}