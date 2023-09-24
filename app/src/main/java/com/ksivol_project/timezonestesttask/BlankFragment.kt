package com.ksivol_project.timezonestesttask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ksivol_project.timezonestesttask.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding
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

    private fun connect() = with(binding) {
        val cityChoose = mapOf(
            activity?.getString(R.string.city1) to R.drawable.time1,
            activity?.getString(R.string.city2) to R.drawable.time2,
            activity?.getString(R.string.city3) to R.drawable.time3,
            activity?.getString(R.string.city4) to R.drawable.time4,
            activity?.getString(R.string.city5) to R.drawable.time5,
            activity?.getString(R.string.city6) to R.drawable.time6
        )
        val param = mutableListOf<String>()
        cityChoose.keys.forEach {
            if (it != null) {
                param.add(it)
            }
        }
        val shuffledtest = param.shuffled()
        city1.text = shuffledtest[0]
        cityView1.setImageResource(cityChoose[shuffledtest[0]]!!)
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment()
    }
}
