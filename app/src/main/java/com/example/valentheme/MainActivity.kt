package com.example.valentheme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.valentheme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var isNightMode: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            if (isNightMode)
            {
                isNightMode=false
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            else
            {
                isNightMode=true
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }

        }

    }
}
//Pada main activity.kt, berisi perintah untuk menguybah dari tem,a light menjadi tema dark, pada baris ke 16 menjadikan btn sebagai setonclicklistener lalu pada baris ke 17 hingga 21 apabila
//night mode sama dengan false maka akan menampilakn night mode sedangkan pada baris ke 23 hingga 25 apabila night mode samadengan true makan akan menampilkan mode light