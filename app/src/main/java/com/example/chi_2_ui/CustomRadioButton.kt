package com.example.chi_2_ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TableLayout

class CustomRadioButton(context: Context, attrs: AttributeSet? = null) :
    TableLayout(context, attrs) {
    init {
        View.inflate(getContext(), R.layout.custom_view, this)
    }
}