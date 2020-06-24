package com.phongbm.dihilt.presentation.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import java.util.*

/**
 * Created by PhongBM on 06/17/2020
 */

class HomeViewModel
@ViewModelInject
constructor() : ViewModel() {
    var number = Random().nextInt()

}