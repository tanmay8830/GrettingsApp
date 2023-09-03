

package com.example.grettingsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class scrren_2 : AppCompatActivity() {

    lateinit var btnback:Button
    lateinit var txtview2:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrren2)

       btnback = findViewById(R.id.btnprevious)
       txtview2 = findViewById(R.id.text2)


       var name =intent.getStringExtra("name")

        println("name :  ${name}")


       txtview2.setText("Hello,"+name)
        
        btnback.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent=Intent(this@scrren_2,MainActivity::class.java)
                startActivities(arrayOf(intent))
            }
        })
        }

    }

