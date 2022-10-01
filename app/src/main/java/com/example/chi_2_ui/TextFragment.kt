package com.example.chi_2_ui

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.chi_2_ui.databinding.FragmentTextBinding


class TextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_text, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textButton = view.findViewById<Button>(R.id.text_button)
        val textTvUp = view.findViewById<TextView>(R.id.text_tv_up)
        val textTvDown = view.findViewById<TextView>(R.id.text_tv_down)
        val textTvRight = view.findViewById<TextView>(R.id.text_tv_right)
        val textTvLeft = view.findViewById<TextView>(R.id.text_tv_left)
        val textButtonText = textButton.text

        textButton.setOnClickListener {
            textButton.text = textButtonText
            textButton.setTextColor(resources.getColor(R.color.white, context?.theme))
        }


        textTvUp.setOnClickListener {
            textButton.text = textTvUp.text
            textButton.setTextColor(textTvUp.textColors)
        }

        textTvDown.setOnClickListener {
            textButton.text = textTvDown.text
            textButton.setTextColor(textTvDown.textColors)
        }

        textTvLeft.setOnClickListener {
            textButton.text = textTvLeft.text
            textButton.setTextColor(textTvLeft.textColors)
        }

        textTvRight.setOnClickListener {
            textButton.text = textTvRight.text
            textButton.setTextColor(textTvRight.textColors)
        }
    }


}