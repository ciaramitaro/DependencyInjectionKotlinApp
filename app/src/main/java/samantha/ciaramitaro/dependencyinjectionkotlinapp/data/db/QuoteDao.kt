package samantha.ciaramitaro.dependencyinjectionkotlinapp.data.db

import androidx.lifecycle.LiveData
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuote(): LiveData<List<Quote>>
}