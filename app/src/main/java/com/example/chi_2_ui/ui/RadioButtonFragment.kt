package com.example.chi_2_ui.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.chi_2_ui.Click
import com.example.chi_2_ui.CustomRadioButton
import com.example.chi_2_ui.R

class RadioButtonFragment : Fragment(), Click {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_radio_button, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val customRadioButton = view.findViewById<CustomRadioButton>(R.id.custom_radio_button)
        customRadioButton.setClick(this)
    }

    override fun onClick(radioButton: RadioButton) {
        Toast.makeText(context, "${radioButton.text} is checked", Toast.LENGTH_SHORT).show()
    }
}