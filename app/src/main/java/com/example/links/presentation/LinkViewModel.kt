package com.example.links.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.links.data.Link

class LinkViewModel : ViewModel() {
    val link = Link("asd", "asd", "asd")
    val links = mutableStateOf(mutableListOf(link))
    var searchText by mutableStateOf("");
}


