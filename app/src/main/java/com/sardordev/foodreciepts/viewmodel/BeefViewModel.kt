package com.sardordev.foodreciepts.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sardordev.foodreciepts.domain.appRepository.AppRepository
import com.sardordev.foodreciepts.utils.ResourseUI
import com.sardordev.foodreciepts.utils.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BeefViewModel @Inject constructor(private val appRepository: AppRepository) : ViewModel() {
    private val _beefobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val beefobserver: StateFlow<UiEvent> get() = _beefobserver
    private val _chickenobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val chickenobserver: StateFlow<UiEvent> get() = _chickenobserver
    private val _saucenobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val sauceobserver: StateFlow<UiEvent> get() = _saucenobserver
    private val _dessertnobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val dessertnobserver: StateFlow<UiEvent> get() = _dessertnobserver

    private val _vegeterianobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val vegeteriannobserver: StateFlow<UiEvent> get() = _vegeterianobserver

    private val _soupetnobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val soupeobserver: StateFlow<UiEvent> get() = _soupetnobserver

    private val _seafoodnobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val seafoodobserver: StateFlow<UiEvent> get() = _seafoodnobserver

    private val _breakfastobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val breakfastobserver: StateFlow<UiEvent> get() = _breakfastobserver


    private val _snackobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val snackobserver: StateFlow<UiEvent> get() = _snackobserver


    private val _paultryobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val pautryobserver: StateFlow<UiEvent> get() = _paultryobserver

    private val _drinksobserver = MutableStateFlow<UiEvent>(UiEvent.Empty)
    val drinksobserver: StateFlow<UiEvent> get() = _drinksobserver


    fun getDesertData() {
        viewModelScope.launch {
            _dessertnobserver.value = UiEvent.Loading
            val result = appRepository.getDessertsData()
            when (result) {
                is ResourseUI.Error -> {
                    _dessertnobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _dessertnobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getVegeteriansData() {
        viewModelScope.launch {
            _vegeterianobserver.value = UiEvent.Loading
            val result = appRepository.getVegeteriansData()
            when (result) {
                is ResourseUI.Error -> {
                    _vegeterianobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _vegeterianobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getSoupesData() {
        viewModelScope.launch {
            _soupetnobserver.value = UiEvent.Loading
            val result = appRepository.getSoupesData()
            when (result) {
                is ResourseUI.Error -> {
                    _soupetnobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _soupetnobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getSeaFoodsData() {
        viewModelScope.launch {
            _seafoodnobserver.value = UiEvent.Loading
            val result = appRepository.getSeaFoodsData()
            when (result) {
                is ResourseUI.Error -> {
                    _seafoodnobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _seafoodnobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getBreakfastsData() {
        viewModelScope.launch {
            _breakfastobserver.value = UiEvent.Loading
            val result = appRepository.getBreakfastsData()
            when (result) {
                is ResourseUI.Error -> {
                    _breakfastobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _breakfastobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getSnacksData() {
        viewModelScope.launch {
            _snackobserver.value = UiEvent.Loading
            val result = appRepository.getSnacksData()
            when (result) {
                is ResourseUI.Error -> {
                    _snackobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _snackobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getPaultrysData() {
        viewModelScope.launch {
            _paultryobserver.value = UiEvent.Loading
            val result = appRepository.getPaultrysData()
            when (result) {
                is ResourseUI.Error -> {
                    _paultryobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _paultryobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getDrinkssData() {
        viewModelScope.launch {
            _drinksobserver.value = UiEvent.Loading
            val result = appRepository.getDrinkssData()
            when (result) {
                is ResourseUI.Error -> {
                    _drinksobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _drinksobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }


    fun getBeefData() {
        viewModelScope.launch {
            _beefobserver.value = UiEvent.Loading
            val result = appRepository.getBeefData()
            when (result) {
                is ResourseUI.Error -> {
                    _beefobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _beefobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getChickenData() {
        viewModelScope.launch {
            _chickenobserver.value = UiEvent.Loading
            val result = appRepository.getChickenData()
            when (result) {
                is ResourseUI.Error -> {
                    _chickenobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _chickenobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }

    fun getSauceData() {
        viewModelScope.launch {
            _saucenobserver.value = UiEvent.Loading
            val result = appRepository.getSauceData()
            when (result) {
                is ResourseUI.Error -> {
                    _saucenobserver.value = UiEvent.Error(message = result.message)
                }
                is ResourseUI.Success -> {
                    _saucenobserver.value = UiEvent.Success(result.data)
                }
            }
        }
    }


}