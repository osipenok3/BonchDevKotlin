package com.example.homework

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener


class MainActivity : AppCompatActivity(), OnClickListener {


    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var textView: TextView
    lateinit var  Button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.number1)
        editText2 = findViewById(R.id.number2)
        textView = findViewById(R.id.sumresult)
        Button = findViewById(R.id.calculate)


        Button.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val name = (editText1.text.toString().toInt()+editText2.text.toString().toInt()).toString()
        textView.text = name
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString("KEY",textView.text.toString())
        }
        super.onSaveInstanceState(outState)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textView.text=savedInstanceState.getString("KEY")
    }

}

