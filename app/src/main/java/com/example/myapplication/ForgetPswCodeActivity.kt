package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityForgetPswCheckBinding
import com.example.myapplication.databinding.ActivityForgetPswCodeBinding

class ForgetPswCodeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityForgetPswCodeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPswCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.forgotPswCodeButton.setOnClickListener {
            startActivity(Intent(this, ForgetPswMain::class.java))
        }
    }
}