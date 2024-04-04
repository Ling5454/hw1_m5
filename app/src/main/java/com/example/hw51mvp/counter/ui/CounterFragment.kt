package com.example.hw51mvp.counter.ui

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.hw51mvp.counter.view.Injector
import com.example.hw51mvp.counter.view.CounterView
import com.example.hw51mvp.databinding.FragmentCounterBinding

class CounterFragment : Fragment(), CounterView {
    lateinit var binding: FragmentCounterBinding
    var presenter = Injector.getPresenter(this)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCounterBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incBtn.setOnClickListener {
                presenter.increment()
                presenter.showToast()
                presenter.chaneTextColor()
            }
            decBtn.setOnClickListener {
                presenter.decrement()
                presenter.showToast()
                presenter.chaneTextColor()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(requireContext(), "поздравляем", Toast.LENGTH_SHORT).show()
    }

    override fun chaneTextColor() {
        binding.resultTv.setTextColor(Color.GREEN)
    }

    override fun chaneTextColorBack() {
        binding.resultTv.setTextColor(Color.BLACK)
    }
}