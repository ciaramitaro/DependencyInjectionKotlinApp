package samantha.ciaramitaro.dependencyinjectionkotlinapp.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.model.Quote

class QuoteDaoFakeImpl: QuoteDao{
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        //This connects the list to the observable data holder class
        quotes.value = quoteList
    }
    override fun addQuote(quote: Quote){
        quoteList.add(quote)
        //This updates the observable value with updated list
        //which will trigger all the observers of this mutableLive Data of List holding type Quote
        quotes.value = quoteList
    }
    //Casting quotes to be LiveData because we don't want it to be mutable outside DAO class
    override fun getQuote()= quotes as LiveData<List<Quote>>
}