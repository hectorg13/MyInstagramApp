package com.smartsolution.myinstagramapp.ui.reels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReelsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Reels Fragment"
    }
    val text: LiveData<String> = _text
}