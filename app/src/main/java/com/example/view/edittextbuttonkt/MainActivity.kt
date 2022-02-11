package com.example.view.edittextbuttonkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btn_getText: Button
    private lateinit var et_id: EditText
    private lateinit var tv_id: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_id=findViewById(R.id.et_id)
        tv_id=findViewById(R.id.tv_id)
        btn_getText=findViewById(R.id.btn_id)

        btn_getText.setOnClickListener{ //editext에 잇는 값을 가져와서 textview에 뿌려줍니다.

            var resultText=et_id.text.toString()
            tv_id.setText(resultText)
        }
    }
}