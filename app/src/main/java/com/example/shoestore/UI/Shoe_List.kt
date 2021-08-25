package com.example.shoestore.UI

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.shoestore.R
import com.example.shoestore.ViewModel.SharedViewModel
import com.example.shoestore.databinding.ShoeListBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoestore.R.id.*
import com.example.shoestore.data.Shoe_List_Data


class Shoe_List : Fragment() {
  private lateinit var shoeListBinding: ShoeListBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        shoeListBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_list, container, false)

        val viewModel =ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        setHasOptionsMenu(true)

        viewModel.dataList.observe(viewLifecycleOwner, Observer {shoe ->
                        listView(shoe)
        })


        shoeListBinding.floatingActionButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_shoe_List_to_shoe_details)

        }

        return shoeListBinding.root
    }

    private fun listView(shoe: List<Shoe_List_Data>) {


            shoe.forEach{

                shoeListBinding.textViewCompany.text =it.shoe_company
                shoeListBinding.textViewDescription.text= it.shoe_description
                shoeListBinding.textViewName.text= it.shoe_name
                shoeListBinding.textViewSize.text= it.shoe_size.toString()

            }
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) ||
                super.onOptionsItemSelected(item)
    }
}

