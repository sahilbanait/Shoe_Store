package com.example.shoestore.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.data.Shoe_List_Data

class SharedViewModel(): ViewModel(){

    private lateinit var shoeList: MutableList<Shoe_List_Data>
    private var shoes = mutableListOf<Shoe_List_Data>()

    private val _shoeLiveData = MutableLiveData<List<Shoe_List_Data>>()
    val dataList:LiveData<List<Shoe_List_Data>>
    get() = _shoeLiveData


    fun loadList(shoeListData: Shoe_List_Data) {
        shoeList = mutableListOf<Shoe_List_Data>()
        _shoeLiveData.value= shoeList


    }
    fun onSave(shoe_name: String, shoe_company: String, shoe_size:String, shoe_description: String){
        val new_Shoe = Shoe_List_Data(shoe_name,shoe_company,shoe_size,shoe_description)

        new_Shoe?.let { shoe ->
            shoes.add(shoe)
            _shoeLiveData.value = shoes
        }
    }
    fun resetList(){
        val item: Shoe_List_Data
        item= Shoe_List_Data("","","","")
    }

    override fun onCleared() {
        super.onCleared()
    }



}


