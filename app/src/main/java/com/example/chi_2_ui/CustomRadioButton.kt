package com.example.chi_2_ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RadioButton
import android.widget.TableLayout

class CustomRadioButton(context: Context, attrs: AttributeSet? = null) :
    TableLayout(context, attrs) {
    private lateinit var click: Click

    init {
        View.inflate(getContext(), R.layout.custom_view, this)
        val radioButtonCenter = findViewById<RadioButton>(R.id.radio_button_center)
        val radioButtonUpper = findViewById<RadioButton>(R.id.radio_button_upper)
        val radioButtonBottom = findViewById<RadioButton>(R.id.radio_button_bottom)
        val radioButtonRight = findViewById<RadioButton>(R.id.radio_button_right)
        val radioButtonLeft = findViewById<RadioButton>(R.id.radio_button_left)
        val arrayList = arrayListOf<RadioButton>(
            radioButtonCenter,
            radioButtonUpper,
            radioButtonBottom,
            radioButtonRight,
            radioButtonLeft
        )

        arrayList.forEach { radioButton ->
            radioButton.setOnClickListener {
                arrayList.forEach { it.isChecked = false }
                radioButton.isChecked = true
                click.onClick(radioButton)
            }
        }

    }

    fun setClick(click: Click) {
        this.click = click
    }
}