package com.example.shoestore.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.UI.Shoe_List

class Shoe_List_ViewModel: ViewModel(){
    private val _brandName = MutableLiveData<String>()
    val brandName:LiveData<String>
    get() = _brandName
    private val _shoeSize = MutableLiveData<String>()
    val shoeSize:LiveData<String>
        get() = _shoeSize
    private val _shoeColor = MutableLiveData<String>()
    val shoeColor:LiveData<String>
        get() = _shoeColor

    private fun getShoeDetails(){
        _brandName.value
        _shoeColor.value
        _shoeSize.value
    }


//
//    private val shoe_list: MutableLiveData<List<Shoe_List>> by lazy {
//        MutableLiveData<List<Shoe_List>>().also {
//            loadList()
//        }
//    }
//    fun getList(): LiveData<List<Shoe_List>>{
//        return getList()
//    }
//    private fun loadList(){
//        shoe_list.value
//    }
//    fun onSave(){
//        shoe_list.value
//    }

}