package com.smartsolution.myinstagramapp.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.smartsolution.myinstagramapp.data.PostsProvider
import com.smartsolution.myinstagramapp.databinding.FragmentProfileBinding
import com.smartsolution.myinstagramapp.ui.profile.adapter.ProfileAdapter
import com.smartsolution.myinstagramapp.ui.profile.adapter.StoryAdapter

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerGrid()
        setupRecyclerStory()
    }

    private fun setupRecyclerGrid() {
        binding.rvProfileGrid.layoutManager = GridLayoutManager(requireContext(), 3)
        binding.rvProfileGrid.adapter = ProfileAdapter(PostsProvider.postLists)
    }

    private fun setupRecyclerStory() {
        binding.rvHighlight.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvHighlight.adapter = StoryAdapter(PostsProvider.storiesLists)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}