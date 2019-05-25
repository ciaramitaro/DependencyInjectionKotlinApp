package samantha.ciaramitaro.dependencyinjectionkotlinapp.ui.quotes

import androidx.lifecycle.ViewModel
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.model.Quote
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.repository.QuoteRepository


class QuoteViewModel (private val quoteRepository: QuoteRepository) : ViewModel() {
    //getting from repository from model factory which gets repository from injectorUtil
    // because it is the logical layer between database & viewModel
    fun getQuotes()= quoteRepository.getQuotes()
    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}

