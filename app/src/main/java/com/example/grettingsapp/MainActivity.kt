package com.example.grettingsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var btn_next:Button
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_next = findViewById(R.id.bntNxt)
        editText = findViewById(R.id.EDIT1)

        btn_next.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                val name:String = editText.text.toString()
                val intent = Intent(this@MainActivity,scrren_2::class.java)
                intent.putExtra("name",name)
                startActivities(arrayOf(intent))
            }

        })

    }
}