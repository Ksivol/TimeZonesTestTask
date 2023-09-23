package com.ksivol_project.timezonestesttask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.ksivol_project.timezonestesttask.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding

    private val cityChoose = mapOf(
        activity?.getString(R.string.city1) to ResourcesCompat.getDrawable(requireActivity().resources, R.drawable.time1,null),
        activity?.getString(R.string.city2) to ResourcesCompat.getDrawable(requireActivity().resources, R.drawable.time2,null),
        activity?.getString(R.string.city3) to ResourcesCompat.getDrawable(requireActivity().resources, R.drawable.time3,null),
        activity?.getString(R.string.city4) to ResourcesCompat.getDrawable(requireActivity().resources, R.drawable.time4,null),
        activity?.getString(R.string.city5) to ResourcesCompat.getDrawable(requireActivity().resources, R.drawable.time5,null),
        activity?.getString(R.string.city6) to ResourcesCompat.getDrawable(requireActivity().resources, R.drawable.time6,null)
    )

    private val cityShuffled = setOf(cityChoose.keys).toTypedArray()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        connect()
    }

    private fun connect() = with(binding){
        cityShuffled.shuffle()
        city1.text = cityShuffled[0].toString()
    }
    companion object {
        @JvmStatic
        fun newInstance() =
            BlankFragment()
    }
}
