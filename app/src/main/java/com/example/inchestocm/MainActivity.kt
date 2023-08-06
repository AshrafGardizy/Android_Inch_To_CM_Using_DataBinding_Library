package com.example.inchestocm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.inchestocm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    val inch = 2.54
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        binding.buttonConvert.setOnClickListener {
//            if (!binding.edTextInch.text.toString().isEmpty()){
//                var number = binding.edTextInch.text.toString().toDouble()
//                var cm = inch * number
//                binding.tvResult.visibility = View.VISIBLE
//                binding.tvResult.text = cm.toString()
//
//            }else{
//               binding.edTextInch.setError("The field cannot be empty")
//            }
//        }
        binding.apply { buttonConvert.setOnClickListener {
                if (!edTextInch.text.toString().isEmpty()){
                    var number = edTextInch.text.toString().toDouble()
                    var cm = inch * number
                    tvResult.visibility = View.VISIBLE
                    tvResult.text = cm.toString()

                }else{
                    edTextInch.setError("The field cannot be empty")
                }
            }
        }

    }
}