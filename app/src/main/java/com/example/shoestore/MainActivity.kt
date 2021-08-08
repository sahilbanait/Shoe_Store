package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.widget.Toolbar
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.shoestore.ViewModel.Shoe_Details_ViewModel
import com.example.shoestore.ViewModel.Shoe_List_ViewModel
import com.example.shoestore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var shoeDetailsViewmodel: Shoe_Details_ViewModel
private lateinit var shoeListViewmodel: Shoe_List_ViewModel
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
        Log.i("GameFragment", "Called ViewModelProvider.get")


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.overflow_menu,menu)
        return true
    }


}