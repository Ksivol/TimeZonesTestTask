package com.ksivol_project.timezonestesttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ksivol_project.timezonestesttask.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FragmentManager.setFragment(this, BlankFragment.newInstance())

    }



}