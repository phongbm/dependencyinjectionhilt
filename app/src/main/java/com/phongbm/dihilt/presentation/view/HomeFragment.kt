package com.phongbm.dihilt.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.phongbm.dihilt.R
import com.phongbm.dihilt.presentation.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*

@AndroidEntryPoint
class HomeFragment : Fragment() {
    companion object {
        private const val TAG = "HomeFragment"
    }

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()...")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView()...")
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated()...")

        txtNumber.text = viewModel.number.toString()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()...")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()...")
    }

    override fun onPause() {
        Log.d(TAG, "onPause()...")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop()...")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView()...")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy()...")
        super.onDestroy()
    }

}