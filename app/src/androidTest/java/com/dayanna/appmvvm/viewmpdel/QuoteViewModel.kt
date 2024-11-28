package com.dayanna.appmvvm.viewmpdel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dayanna.appmvvm.model.QuoteModel
import com.dayanna.appmvvm.model.QuoteProvider

class QuoteViewModel:ViewModel (){
    val  quoteModel = MutableLiveData<QuoteModel>()



    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }




}
