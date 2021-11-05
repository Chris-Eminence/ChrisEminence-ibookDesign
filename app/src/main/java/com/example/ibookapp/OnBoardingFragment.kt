package com.example.ibookapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.ibookapp.databinding.FragmentOnBoardingBinding
import com.example.ibookapp.databinding.FragmentSplashScreenBinding

class OnBoardingFragment : Fragment() {
    private lateinit var _binding : FragmentOnBoardingBinding
    private val binding get() = _binding
    private lateinit var navCon : NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.getStartedButton.setOnClickListener {
            navCon.navigate(R.id.action_onBoardingFragment_to_loginFragment)
        }
    }
}