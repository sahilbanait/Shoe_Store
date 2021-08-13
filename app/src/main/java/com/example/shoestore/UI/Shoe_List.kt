package com.example.shoestore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.shoestore.R
import com.example.shoestore.ViewModel.Shoe_List_ViewModel
import com.example.shoestore.databinding.ShoeListBinding


class Shoe_List : Fragment() {
  private lateinit var shoeListBinding: ShoeListBinding
  private val shoeListViewmodel: Shoe_List_ViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        shoeListBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_list, container, false)

        shoeListBinding.floatingActionButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_shoe_List_to_shoe_details)
        }


        return shoeListBinding.root
    }


}