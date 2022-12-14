package com.example.omarosama

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.omarosama.databinding.FragmentLastBinding
import com.example.omarosama.models.Shoe


class lastFragment : Fragment() {
    private lateinit var binding: FragmentLastBinding
    private lateinit var viewModel:ShoeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel=ViewModelProvider(requireActivity())[ShoeViewModel::class.java]
        binding=DataBindingUtil.inflate(layoutInflater,R.layout.fragment_last, container, false)
binding.gg=viewModel
    binding.Add.setOnClickListener {
        viewModel.new.apply {
            viewModel.showw(shoe = this)

            Toast.makeText(context, "Shoe Added", Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(activity,"Done",Toast.LENGTH_SHORT).show()
    }
         binding.cancel.setOnClickListener {
             var actionnn = lastFragmentDirections.actionLastFragmentToScreen4Fragment()
             findNavController().navigate(actionnn)
         }

        return binding.root
    }


}