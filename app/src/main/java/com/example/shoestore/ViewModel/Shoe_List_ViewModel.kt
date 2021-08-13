package com.example.shoestore.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.UI.Shoe_List
import com.example.shoestore.data.Shoe_List_Data

class Shoe_List_ViewModel(val shoeList: Shoe_List_Data): ViewModel(){

    private var _brandName = MutableLiveData<String>()
    val brandName:LiveData<String>
    get() = _brandName
    private var _shoeSize = MutableLiveData<String>()
    val shoeSize:LiveData<String>
        get() = _shoeSize
    private var _shoeCompany = MutableLiveData<String>()
    val shoeColor:LiveData<String>
        get() = _shoeCompany
    private var _shoeDescription = MutableLiveData<String>()
    val shoeDescription: LiveData<String>
    get() = _shoeDescription



    fun onSave(list: Shoe_List){
        _brandName.value = shoeList.toString()
        _shoeCompany.value = shoeList.toString()
        _shoeSize.value = shoeList.toString()
        _shoeDescription.value = shoeList.toString()

    }

    override fun onCleared() {
        super.onCleared()
    }
}