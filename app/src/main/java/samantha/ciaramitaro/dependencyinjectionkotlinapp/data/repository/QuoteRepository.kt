package samantha.ciaramitaro.dependencyinjectionkotlinapp.data.repository

import androidx.lifecycle.LiveData
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}