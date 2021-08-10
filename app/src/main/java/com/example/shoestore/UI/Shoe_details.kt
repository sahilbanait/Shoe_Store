package com.example.shoestore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation

import com.example.shoestore.R
import com.example.shoestore.ViewModel.Shoe_List_ViewModel
import com.example.shoestore.databinding.ShoeDetailsBinding


class Shoe_details : Fragment() {
    private lateinit var shoeDetailsBinding: ShoeDetailsBinding
    private lateinit var viewModel: Shoe_List_ViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?

    {

      shoeDetailsBinding= DataBindingUtil.inflate(inflater, R.layout.shoe_details, container, false)

        shoeDetailsBinding.buttonCancel.setOnClickListener { view:View ->
            Navigation.findNavController(view).navigate(R.id.shoe_List)
            viewModel = ViewModelProvider(this).get(Shoe_List_ViewModel::class.java)

        }
        return shoeDetailsBinding.root
    }
    private fun onSave(){

        val shoeSize = shoeDetailsBinding.edShoeSize.text.toString()

    }


}