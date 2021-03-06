package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.shoestore.ViewModel.SharedViewModel
import com.example.shoestore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var sharedViewmodel: SharedViewModel
private lateinit var mainBinding: ActivityMainBinding
private lateinit var appBarConfiguration: AppBarConfiguration




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding.lifecycleOwner = this
  
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        setSupportActionBar(mainBinding.toolbar)
        NavigationUI.setupWithNavController(mainBinding.toolbar, navController, appBarConfiguration)
    }



}