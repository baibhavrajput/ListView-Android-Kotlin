package com.example.listviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv_fruitsName.adapter = ArrayAdapter<String>(
            this,
            R.layout.list_view_contents,
            R.id.textView,
            arrayOf(
                    "Apple",
                    "Mango",
                    "Grapes",
                    "Kiwi",
                    "Peach",
                    "Apple",
                    "Mango",
                    "Grapes",
                    "Kiwi",
                    "Peach",
                    "Apple",
                    "Mango",
                    "Grapes",
                    "Kiwi",
                    "Peach"
            )
        )

    }
}