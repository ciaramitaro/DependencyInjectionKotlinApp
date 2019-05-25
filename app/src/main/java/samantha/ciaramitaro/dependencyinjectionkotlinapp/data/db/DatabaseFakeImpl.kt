package samantha.ciaramitaro.dependencyinjectionkotlinapp.data.db

class DatabaseFakeImpl : Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}