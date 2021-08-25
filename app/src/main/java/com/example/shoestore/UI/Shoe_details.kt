package com.example.shoestore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation

import com.example.shoestore.R
import com.example.shoestore.ViewModel.SharedViewModel
import com.example.shoestore.data.Shoe_List_Data
import com.example.shoestore.databinding.ShoeDetailsBinding


class Shoe_details : Fragment() {
    private lateinit var shoeDetailsBinding: ShoeDetailsBinding
  lateinit var sharedViewmodel: SharedViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?

    {

      shoeDetailsBinding= DataBindingUtil.inflate(inflater, R.layout.shoe_details, container, false)
        sharedViewmodel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        shoeDetailsBinding.buttonCancel.setOnClickListener { view:View ->
            Navigation.findNavController(view).navigate(R.id.shoe_List)
        }

        shoeDetailsBinding.buttonSave.setOnClickListener { view: View ->
            onSave()
            Navigation.findNavController(view).navigate(R.id.shoe_List)


        }
        return shoeDetailsBinding.root
    }

    private fun onSave() {
        val binder = shoeDetailsBinding.shoeListData
        val name = binder?.shoe_name.toString()
        val company = binder?.shoe_company.toString()
        val description = binder?.shoe_description.toString()
        val size = binder?.shoe_size.toString()
        sharedViewmodel.onSave(size,name,company,description)
    }

}