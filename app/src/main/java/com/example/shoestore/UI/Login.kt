package com.example.shoestore.UI

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation

import com.example.shoestore.R
import com.example.shoestore.databinding.LoginBinding


class Login : Fragment() {
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