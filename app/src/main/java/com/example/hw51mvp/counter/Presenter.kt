package com.example.hw51mvp.counter

import com.example.hw51mvp.counter.view.Injector
import com.example.hw51mvp.counter.view.CounterView

class Presenter(private var counterView: CounterView) {

    private val model = Injector.getModel()

    fun increment() {
        model.inc()
        counterView.showCount(model.count)
    }

    fun decrement() {
        model.dec()
        counterView.showCount(model.count)
    }

    fun showToast() {
        if (model.count == 10) {
            counterView.showToast()
        }
    }
    fun chaneTextColor(){
        if (model.count==15){
            counterView.chaneTextColor()
        }else{
            counterView.chaneTextColorBack()
        }
    }

}