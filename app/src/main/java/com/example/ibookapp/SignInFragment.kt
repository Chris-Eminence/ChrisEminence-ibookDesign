package com.example.ibookapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.ibookapp.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    private lateinit var _binding : FragmentSignInBinding
    private val binding get() = _binding
    private lateinit var navCon : NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.signUpButton.setOnClickListener {
            navCon.navigate(R.id.action_signInFragment_to_loginFragment)
        }
    }
}