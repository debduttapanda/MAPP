package com.debdutta.mapp.presentation

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.debdutta.core.domain.FetchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(private val fetchUseCase: FetchUseCase) : ObservableViewModel() {
    @Bindable
    val name = MutableLiveData<String>("No text")
    val buttonText = MutableLiveData<String>("Fetch")

    fun onFetchClick()
    {
        fetch()
    }

    private fun fetch() {
        fetchUseCase().onEach {result->
            name.value = result.data?.title?:"Error"
        }.launchIn(viewModelScope)
    }
}