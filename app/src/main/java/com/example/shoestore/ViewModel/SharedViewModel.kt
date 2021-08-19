package com.example.shoestore.ViewModel

import android.widget.ListView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.UI.Shoe_List
import com.example.shoestore.data.Shoe_List_Data

class SharedViewModel(): ViewModel(){

    private val shoeList = mutableListOf<Shoe_List_Data>()
    private val _shoeListLiveData = MutableLiveData<List<Shoe_List_Data>>()
    val dataList:LiveData<List<Shoe_List_Data>>
    get() = _shoeListLiveData


    fun loadList(shoeListData: Shoe_List_Data) {
        shoeList.add(shoeListData)
        _shoeListLiveData.value = shoeList
        _shoeListLiveData.postValue(shoeList)



    }

    override fun onCleared() {
        super.onCleared()
    }


}


