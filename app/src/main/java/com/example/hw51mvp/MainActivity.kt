package com.example.hw51mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.hw51mvp.counter.ui.CounterFragment
import com.example.hw51mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment(CounterFragment())
    }
    private fun loadFragment(fragment:Fragment) {
        val transaction= supportFragmentManager.beginTransaction()
        transaction.replace(R.id.mainContainer,fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }
}