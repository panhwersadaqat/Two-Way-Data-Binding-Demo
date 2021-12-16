package com.example.twowaydatabindingdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/14/21.
 */
class MainActivityViewModel : ViewModel() {
     var userName = MutableLiveData<String>()

    init {
        userName.value = "Sadaqat"
    }

}