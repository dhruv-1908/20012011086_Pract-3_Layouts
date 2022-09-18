package com.example.a20012011086_pract_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class thirdactivity : AppCompatActivity() {
    lateinit var textView3: TextView
    //lateinit var textView6: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactivity)

//        textView6=findViewById(R.id.textView3)
        textView3=findViewById(R.id.textView3)
        val intent2=intent
        val message=intent2.getStringExtra("secondactivity").toString()
        textView3.text=message
    }
//    private fun String?.toString(editTextTextPersonName: TextView): String {
//        editTextTextPersonName.text=textView3
//    }
}


