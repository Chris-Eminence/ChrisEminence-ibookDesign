package com.example.ibookapp

import android.os.Bundle
import android.provider.Settings.Global.putString
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.ibookapp.databinding.FragmentLoginBinding
import com.example.ibookapp.databinding.FragmentOnBoardingBinding

class LoginFragment : Fragment() {

    private lateinit var _binding : FragmentLoginBinding
    private val binding get() = _binding
    private lateinit var navCon : NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.signInButton.setOnClickListener {
            navCon.navigate(R.id.action_loginFragment_to_signInFragment)
        }
    }
}