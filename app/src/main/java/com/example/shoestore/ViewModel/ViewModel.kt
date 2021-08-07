package com.example.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.shoestore.Shoe_Details_Data.shoe_details_data
import com.example.shoestore.databinding.LoginBinding

class   LoginViewModel : ViewModel()
{
    var shoeDetailsData = MutableLiveData<shoe_details_data>()
}


