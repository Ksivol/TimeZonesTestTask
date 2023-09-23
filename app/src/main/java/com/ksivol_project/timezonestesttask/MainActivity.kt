package com.ksivol_project.timezonestesttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.ksivol_project.timezonestesttask.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.replace(R.id.pidaras, BlankFragment.newInstance())
        beginTransaction.commit()

    }


}