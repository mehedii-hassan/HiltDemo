package com.example.hiltdemo.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hiltdemo.R
import com.example.hiltdemo.viewmodels.PaginationViewModel

class PaginationFragment : Fragment() {

    companion object {
        fun newInstance() = PaginationFragment()
    }

    private lateinit var viewModel: PaginationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pagination, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PaginationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}