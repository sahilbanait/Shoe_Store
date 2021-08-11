package com.example.shoestore.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.UI.Shoe_List

class Shoe_List_ViewModel: ViewModel(){

    private var _brandName = MutableLiveData<String>()
    val brandName:LiveData<String>
    get() = _brandName
    private var _shoeSize = MutableLiveData<String>()
    val shoeSize:LiveData<String>
        get() = _shoeSize
    private var _shoeColor = MutableLiveData<String>()
    val shoeColor:LiveData<String>
        get() = _shoeColor

     fun shoeList(newShoeList: String){
        _brandName.value = newShoeList
        _shoeColor.value= newShoeList
        _shoeSize.value= newShoeList
    }


}