package com.example.shoestore.UI

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

import com.example.shoestore.R
import com.example.shoestore.ViewModel.SharedViewModel
import com.example.shoestore.data.Shoe_List_Data
import com.example.shoestore.databinding.ShoeDetailsBinding
import com.google.android.material.snackbar.Snackbar


class Shoe_details : Fragment() {
    private lateinit var shoeDetailsBinding: ShoeDetailsBinding
    lateinit var sharedViewmodel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

// Inflating the view using data binding
        shoeDetailsBinding =
            DataBindingUtil.inflate(inflater, R.layout.shoe_details, container, false)

        shoeDetailsBinding.shoeListData = Shoe_List_Data()

        sharedViewmodel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        shoeDetailsBinding.shoeListData = Shoe_List_Data()

// Setting clickListener to navigate back to Shoe_List
        shoeDetailsBinding.buttonCancel.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_shoe_details_to_shoe_List)
        }

        shoeDetailsBinding.buttonSave.setOnClickListener { view: View ->
            onSave()

        }
        return shoeDetailsBinding.root
    }

    // Saving the shoes details
    private fun onSave() {

        val binder = shoeDetailsBinding.shoeListData
        val name = binder?.shoe_name.toString()
        val company = binder?.shoe_company.toString()
        val description = binder?.shoe_description.toString()
        val size = binder?.shoe_size.toString()



        if (name!!.isEmpty() || size!!.isEmpty() || company!!.isEmpty() || description!!.isEmpty()) {
            Toast.makeText(context, "Please fill all the information", Toast.LENGTH_SHORT).show()
        } else {
            sharedViewmodel.onSave(size, name, company, description)
            findNavController().navigate(R.id.action_shoe_details_to_shoe_List)



        }

    }
}