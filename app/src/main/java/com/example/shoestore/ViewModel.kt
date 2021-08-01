package com.example.shoestore

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.shoestore.databinding.LoginBinding

class   LoginViewModel : ViewModel()
{
    private lateinit var binding: LoginBinding

fun onClickSignIn(){
    binding.buttonSignIn.setOnClickListener{view: View->
        Navigation.findNavController(view).navigate(R.id.action_login_to_welcome)
    }
}


}