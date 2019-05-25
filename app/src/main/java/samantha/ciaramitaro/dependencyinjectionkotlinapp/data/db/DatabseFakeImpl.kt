package samantha.ciaramitaro.dependencyinjectionkotlinapp.data.db

class DatabseFakeImpl : Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}