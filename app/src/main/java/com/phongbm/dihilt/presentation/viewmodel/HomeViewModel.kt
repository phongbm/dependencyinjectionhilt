package com.phongbm.dihilt.presentation.viewmodel

import androidx.lifecycle.ViewModel
import java.util.*
import javax.inject.Inject

/**
 * Created by PhongBM on 06/17/2020
 */

class HomeViewModel
@Inject
constructor() : ViewModel() {
    var number = Random().nextInt()

}