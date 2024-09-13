package com.LucasSantana.Exercicio4

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.LucasSantana.Exercicio4.databinding.ActivityMainBinding
import com.LucasSantana.Exercicio4.databinding.ActivityTelaSorteioBinding

class TelaSorteio : AppCompatActivity() {

    private lateinit var binding: ActivityTelaSorteioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaSorteioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSorteio.setOnClickListener{
            binding.textView2.setText((0..100).random().toString())
        }

    }
}