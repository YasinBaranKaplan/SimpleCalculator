package com.yasinbarankaplan.easycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yasinbarankaplan.easycalculator.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }




    fun topla(view: View){
        val num1 = binding.Num1.text.toString().toInt()
        val num2 = binding.Num2.text.toString().toInt()

        var result = num1+num2
        binding.Result.text = result.toString()

    }

    fun cikar(view: View){
        val num1 = binding.Num1.text.toString().toDouble()
        val num2 = binding.Num2.text.toString().toDouble()

        var result : Double
        if(num1 <= num2){
            result = num2 - num1
            binding.Result.text = result.toString()
        }
        else{
            result = num1 - num2
            binding.Result.text = result.toString()
        }

    }
    fun carp(view: View){
        val num1 = binding.Num1.text.toString().toDouble()
        val num2 = binding.Num2.text.toString().toDouble()

        val result = num1*num2
        binding.Result.text = result.toString()

    }
    fun bol(view: View){
        val num1 = binding.Num1.text.toString().toDouble()
        val num2 = binding.Num2.text.toString().toDouble()

        val result = num1/num2
        binding.Result.text = result.toString()


    }

    fun usAlma(view: View){
        val num1 = binding.Num1.text.toString().toDouble()
        val num2 = binding.Num2.text.toString().toDouble()

            var result = Math.pow(num1,num2)

        binding.Result.text = result.toString()

    }
}