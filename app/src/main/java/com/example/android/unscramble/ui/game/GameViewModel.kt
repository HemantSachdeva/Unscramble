package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private var score = 0
    private var currentWordCount = 0

    // Declare private mutable variable that can only be modified
    // within the class it is declared.
    private var _currentScrambledWord = "test"

    // Declare another public immutable field and override its getter method.
    // Return the private property's value in the getter method.
    // When count is accessed, the get() function is called and
    // the value of _count is returned.
    val currentScrambledWord: String get() = _currentScrambledWord

    init {
        Log.d(TAG, "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "GameViewModel Destroyed")
    }

    companion object {
        const val TAG = "GameFragment"
    }
}
