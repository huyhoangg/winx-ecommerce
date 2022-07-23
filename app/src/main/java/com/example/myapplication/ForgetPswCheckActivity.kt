package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityForgetPswCheckBinding

class ForgetPswCheckActivity : AppCompatActivity() {
    private lateinit var binding : ActivityForgetPswCheckBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPswCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.forgotPswMailButton.setOnClickListener {
            startActivity(Intent(this, ForgetPswCodeActivity::class.java))
        }
    }
}