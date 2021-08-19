package com.example.shoestore.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.UI.Shoe_List
import com.example.shoestore.data.Shoe_List_Data

class Shoe_List_ViewModel(  var shoe_name: String ="",
                            var shoe_company: String = "",
                            var shoe_size:String = "",
                            var shoe_description: String= ""): ViewModel(){

//    private var _brandName = MutableLiveData<String>()
//    val brandName:LiveData<String>
//    get() = _brandName
//    private var _shoeSize = MutableLiveData<String>()
//    val shoeSize:LiveData<String>
//        get() = _shoeSize
//    private var _shoeCompany = MutableLiveData<String>()
//    val shoeColor:LiveData<String>
//        get() = _shoeCompany
//    private var _shoeDescription = MutableLiveData<String>()
//    val shoeDescription: LiveData<String>
//    get() = _shoeDescription

    private var _shoeListData = MutableLiveData<List<Shoe_List_Data>>(emptyList())
    val shoeListData: LiveData<List<Shoe_List_Data>>
    get() = _shoeListData


//    fun onSave(list: Shoe_List){
//        _shoeDescription.postValue(list.toString())
//        _shoeSize.postValue(list.toString())
//        _brandName.postValue(list.toString())
//
//
//    }
    init {
        loadList()
    }

    private fun loadList() {

    }

    override fun onCleared() {
        super.onCleared()
    }
}