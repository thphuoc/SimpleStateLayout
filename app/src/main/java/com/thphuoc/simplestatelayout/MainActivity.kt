package com.thphuoc.simplestatelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thphuoc.ssl.SimpleStateLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var currentState = SimpleStateLayout.State.INIT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stateLayout.showState(currentState)
        btnNext.setOnClickListener {
            val states = SimpleStateLayout.State.values()
            currentState = states[(currentState.ordinal + 1) % states.size]
            stateLayout.showState(currentState)
        }
    }
}