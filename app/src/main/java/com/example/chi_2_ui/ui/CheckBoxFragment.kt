package com.example.chi_2_ui.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import com.example.chi_2_ui.R

class CheckBoxFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_check_box, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val checkBoxUpper = view.findViewById<CheckBox>(R.id.checkbox_upper)
        val checkBoxBottom = view.findViewById<CheckBox>(R.id.checkbox_bottom)
        val checkBoxRight = view.findViewById<CheckBox>(R.id.checkbox_right)
        val checkBoxLeft = view.findViewById<CheckBox>(R.id.checkbox_left)
        val arrayList =
            arrayListOf<CheckBox>(checkBoxUpper, checkBoxBottom, checkBoxLeft, checkBoxRight)

        arrayList.forEach { checkBox ->
            checkBox.setOnClickListener {
                arrayList.forEach { it.isChecked = false }
                checkBox.isChecked = true
            }
        }
    }
}