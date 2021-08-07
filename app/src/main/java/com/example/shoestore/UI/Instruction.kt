package com.example.shoestore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoestore.R
import com.example.shoestore.databinding.InstructionBinding


class Instruction : Fragment() {
private lateinit var instructionBinding: InstructionBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
       instructionBinding =  DataBindingUtil.inflate(inflater,
           R.layout.instruction, container, false)
        instructionBinding.buttonInventory.setOnClickListener{view: View ->
            Navigation.findNavController(view).navigate(R.id.action_instruction_to_shoe_List)
        }
        return instructionBinding.root
    }
}