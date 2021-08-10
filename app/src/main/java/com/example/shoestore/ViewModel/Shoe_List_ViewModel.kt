package com.example.shoestore.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.UI.Shoe_List

class Shoe_List_ViewModel: ViewModel(){
    private val shoeList = arrayOf(Shoe_List())
    private val shoe_list: MutableLiveData<List<Shoe_List>> by lazy {
        MutableLiveData<List<Shoe_List>>().also {
            loadList()
        }
    }
    fun getList(): LiveData<List<Shoe_List>>{
        return getList()
    }
    private fun loadList(){
        shoe_list.value


    }


}