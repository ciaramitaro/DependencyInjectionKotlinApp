package samantha.ciaramitaro.dependencyinjectionkotlinapp

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.db.Database
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.db.DatabaseFakeImpl
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.db.QuoteDao
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.repository.QuoteRepoImpl
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.repository.QuoteRepository
import samantha.ciaramitaro.dependencyinjectionkotlinapp.ui.quotes.QuoteViewModelFactory

class QuotesApplication: Application(), KodeinAware {
    override val kodein = Kodein.lazy{
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepoImpl(instance())}
        bind() from provider { QuoteViewModelFactory(instance()) }
    }
}