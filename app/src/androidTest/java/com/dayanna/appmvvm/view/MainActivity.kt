package com.dayanna.appmvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.dayanna.appmvvm.databinding.ActivityMainBinding
import com.dayanna.appmvvm.viewmpdel.QuoteViewModel

class MainActivity : AppCompatActivity()  {

    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel : QuoteViewModel by viewModels ()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

// Llamado del observador para comprobar el estado de la
        // variable MutableLiveData
        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAuthor.text =it.author

        })

        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }

    }
    }
