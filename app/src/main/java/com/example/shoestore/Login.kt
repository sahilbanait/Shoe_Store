package com.example.shoestore

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
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
        setHasOptionsMenu(true)
        return loginBinding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

}