package com.example.b5standardapp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.b5standardapp.InventoryApplication
import com.example.b5standardapp.data.Item
import com.example.b5standardapp.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private val viewModel: DashboardViewModel by activityViewModels {
        InventoryViewModelFactory(
            (activity?.application as InventoryApplication).database
                .itemDao()
        )
    }


    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {



            /*
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)*/

            _binding = FragmentDashboardBinding.inflate(inflater, container, false)
            val root: View = binding.root

            val textView: TextView = binding.textDashboard
            /* dashboardViewModel.seconds().observe(viewLifecycleOwner) {
            textView.text = it.toString()
        }
       // binding.textDashboard.text = dashboardViewModel.number.toString()

        // var no = 0
        binding.btnInc.setOnClickListener {
            dashboardViewModel.startTimer()
           // no++
            *//*dashboardViewModel.addNumber()
            binding.textDashboard.text = dashboardViewModel.number.toString()*//*
        }*/

            binding.btnPut.setOnClickListener {
                var item = Item(1, "groceries", 90.0, 9)
                viewModel.insertData(item)
            }

        binding.btnFind.setOnClickListener { findItem() }



            return root
        }


    private fun findItem() {
        viewModel.retrieveItem(binding.etId.text.toString().toInt()).observe(this.viewLifecycleOwner) {
                foundItem -> binding.textDashboard.text = foundItem.toString()
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}