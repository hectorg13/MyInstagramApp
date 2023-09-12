package com.smartsolution.myinstagramapp.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.smartsolution.myinstagramapp.databinding.FragmentSearchBinding
import com.smartsolution.myinstagramapp.data.PostsProvider
import com.smartsolution.myinstagramapp.ui.search.adapter.ExplorerAdapter

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvExplorer.layoutManager = GridLayoutManager(requireContext(),4)
        binding.rvExplorer.adapter = ExplorerAdapter(PostsProvider.postLists)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}