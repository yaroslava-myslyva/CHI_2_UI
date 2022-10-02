package com.example.chi_2_ui.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chi_2_ui.R
import com.google.android.material.switchmaterial.SwitchMaterial

class SwitchFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_switch, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val switchUpper = view.findViewById<SwitchMaterial>(R.id.switch_upper)
        val switchBottom = view.findViewById<SwitchMaterial>(R.id.switch_bottom)
        val switchRight = view.findViewById<SwitchMaterial>(R.id.switch_right)
        val switchLeft = view.findViewById<SwitchMaterial>(R.id.switch_left)
        val arrayList =
            arrayListOf<SwitchMaterial>(switchUpper, switchBottom, switchRight, switchLeft)

        arrayList.forEach { switch ->
            switch.setOnClickListener {
                arrayList.forEach { it.isChecked = false }
                switch.isChecked = true
            }
        }
    }
}