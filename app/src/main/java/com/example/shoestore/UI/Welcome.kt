package com.example.shoestore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoestore.R
import com.example.shoestore.databinding.WelcomeBinding

class Welcome : Fragment() {
    private lateinit var welcomeBinding: WelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        welcomeBinding= DataBindingUtil.inflate(inflater, R.layout.welcome,container,false)
        welcomeBinding.buttonGetStarted.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_welcome_to_instruction)
        }
        return welcomeBinding.root
    }


}