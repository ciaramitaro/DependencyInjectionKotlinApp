package samantha.ciaramitaro.dependencyinjectionkotlinapp.data.repository

import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.db.QuoteDao
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.model.Quote

class QuoteRepoImpl (private val quoteDao: QuoteDao) : QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }
    override fun getQuotes() = quoteDao.getQuotes()
}