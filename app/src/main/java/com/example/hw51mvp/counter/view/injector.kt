package com.example.hw51mvp.counter.view

import com.example.hw51mvp.counter.Presenter
import com.example.hw51mvp.counter.view.CounterView
import com.example.hw51mvp.model.CounterModel

class Injector {
    companion object{

        fun getModel() = CounterModel()
        fun getPresenter(view: CounterView) = Presenter(view)
    }
}