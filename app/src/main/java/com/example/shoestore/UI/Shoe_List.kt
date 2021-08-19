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
import com.example.shoestore.databinding.ShoeListBinding
import androidx.lifecycle.Observer
import com.example.shoestore.R.id.ed_brandName
import com.example.shoestore.data.Shoe_List_Data


class Shoe_List : Fragment() {
  private lateinit var shoeListBinding: ShoeListBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        shoeListBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_list, container, false)




        val viewModel =ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        viewModel.dataList.observe(viewLifecycleOwner, Observer {
            ListHandler(it as MutableList<Shoe_List_Data>)
        })


        shoeListBinding.floatingActionButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_shoe_List_to_shoe_details)

        }

        return shoeListBinding.root
    }

    private fun ListHandler(shoeList: MutableList<Shoe_List_Data>) {
        shoeList.forEach {
            val inflatedViewDataBinding = DataBindingUtil.inflate<ShoeListBinding>(layoutInflater, R.layout.shoe_list, shoeListBinding.linearlayout, false)
            inflatedViewDataBinding.apply {
                shoeNameTextView.text= shoeListData.toString()
                shoeCompanyTextView.text.toString()
                shoeSizeTextView.text.toString()
                shoeDescriptionTextView.text.toString()
            }
            shoeListBinding.linearlayout.addView(inflatedViewDataBinding.root)
        }
    }


}

