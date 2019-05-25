package samantha.ciaramitaro.dependencyinjectionkotlinapp.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import samantha.ciaramitaro.dependencyinjectionkotlinapp.data.repository.QuoteRepository


class QuoteViewModelFactory(private val quoteRepository: QuoteRepository)
    :ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuoteViewModel(quoteRepository) as T
    }
}
