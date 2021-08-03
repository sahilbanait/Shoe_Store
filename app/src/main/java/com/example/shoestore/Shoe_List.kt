package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.shoestore.databinding.ShoeListBinding


class Shoe_List : Fragment() {
  private lateinit var shoeListBinding: ShoeListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        shoeListBinding = DataBindingUtil.inflate(inflater,R.layout.shoe_list, container, false)

        return shoeListBinding.root
    }


}