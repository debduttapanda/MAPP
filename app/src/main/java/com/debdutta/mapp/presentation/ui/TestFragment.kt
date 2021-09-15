package com.debdutta.mapp.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.debdutta.mapp.presentation.TestViewModel
import com.debdutta.mapp.databinding.FragmentTestBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TestFragment: androidx.fragment.app.Fragment() {
    lateinit var binding: FragmentTestBinding
    val viewModel: TestViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTestBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewmodel = viewModel
    }
}