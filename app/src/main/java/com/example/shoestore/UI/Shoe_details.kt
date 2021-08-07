package com.example.shoestore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoestore.R
import com.example.shoestore.databinding.ShoeDetailsBinding


class Shoe_details : Fragment() {
    private lateinit var shoeDetailsBinding: ShoeDetailsBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?

    {
      shoeDetailsBinding= DataBindingUtil.inflate(inflater, R.layout.shoe_details, container, false)
        shoeDetailsBinding.buttonCancel.setOnClickListener { view:View ->
            Navigation.findNavController(view).navigate(R.id.shoe_List)
        }

        return shoeDetailsBinding.root
    }


}