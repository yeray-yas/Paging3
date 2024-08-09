package com.example.paging3tutorial.presentation

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.example.paging3tutorial.data.RickMortyRepository
import com.example.paging3tutorial.presentation.model.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class RickListViewModel @Inject constructor(rickMortyRepository: RickMortyRepository) :
    ViewModel() {

    val characters: Flow<PagingData<CharacterModel>> = rickMortyRepository.getAllCharacters()

}