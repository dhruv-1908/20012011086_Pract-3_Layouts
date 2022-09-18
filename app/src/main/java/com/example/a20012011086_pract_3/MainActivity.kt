package com.example.a20012011086_pract_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.content.Intent
import android.widget.Button
import android.widget.TextView

lateinit var textView2: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2=findViewById(R.id.textView2)

        textView2.setOnClickListener{
            intent= Intent(this, secondactivity::class.java)
            startActivity(intent)
        }

    }

//    fun GoToNext(view: View) {
//        Log.d("Mainactivity","Clicked.")
//        val message=mMessage_edittext.text.toString()
//        intent=Intent(this,secondactivity::class.java)
//        intent.putExtra("MainActivity",message)
//        startActivity(intent);
//    }

}