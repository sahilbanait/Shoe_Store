package com.example.shoestore.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.data.Shoe_List_Data

class SharedViewModel(): ViewModel(){

    private var shoeList = mutableListOf<Shoe_List_Data>()
    private val _shoeLiveData = MutableLiveData<List<Shoe_List_Data>>()
    val dataList:LiveData<List<Shoe_List_Data>>
    get() = _shoeLiveData


    fun loadList(shoeListData: Shoe_List_Data) {
        shoeList = arrayListOf(shoeListData)


    }
    fun addShoe(shoe: Shoe_List_Data){
        _shoeLiveData.value = listOf(shoe)
    }

    override fun onCleared() {
        super.onCleared()
    }



}


