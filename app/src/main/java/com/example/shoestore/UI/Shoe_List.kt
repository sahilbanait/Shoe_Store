package com.example.shoestore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.shoestore.R
import com.example.shoestore.ViewModel.SharedViewModel
import com.example.shoestore.databinding.ShoeListBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.shoestore.R.id.ed_brandName
import com.example.shoestore.data.Shoe_List_Data


class Shoe_List : Fragment() {
  private lateinit var shoeListBinding: ShoeListBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        shoeListBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_list, container, false)

        val viewModel =ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        val linearLayout = shoeListBinding.linearlayout

        viewModel.dataList.observe(viewLifecycleOwner, Observer {
            val textView = TextView(this.activity)
            textView.text
            textView.layoutParams
            linearLayout.addView(textView)


        })


        shoeListBinding.floatingActionButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_shoe_List_to_shoe_details)

        }

        return shoeListBinding.root
    }



}

