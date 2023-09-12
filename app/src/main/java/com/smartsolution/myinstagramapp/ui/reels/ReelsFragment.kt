package com.smartsolution.myinstagramapp.ui.reels

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.smartsolution.myinstagramapp.databinding.FragmentReelsBinding
import com.smartsolution.myinstagramapp.ui.profile.ProfileViewModel

class ReelsFragment : Fragment() {

    private var _binding: FragmentReelsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val reelsViewModel = ViewModelProvider(this)[ReelsViewModel::class.java]

        _binding = FragmentReelsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}