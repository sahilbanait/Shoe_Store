package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.shoestore.databinding.LoginBinding


class Login : Fragment() {
    private lateinit var viewModel: LoginViewModel
    private lateinit var loginBinding: LoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      loginBinding= DataBindingUtil.inflate( inflater, R.layout.login, container, false)
        loginBinding.buttonSignIn.setOnClickListener {view: View ->
            Navigation.findNavController(view).navigate(R.id.action_login_to_welcome)
        }
        loginBinding.buttonRegister.setOnClickListener {view: View ->
            Navigation.findNavController(view).navigate(R.id.action_login_to_welcome)
        }

        return loginBinding.root
    }

}