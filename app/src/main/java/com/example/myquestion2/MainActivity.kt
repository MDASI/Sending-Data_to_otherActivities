package com.example.myquestion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editText:EditText
    lateinit var editText2:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.btn_click_me)
        editText = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)

        btn.setOnClickListener{
            val intent=Intent(this,SecondActivity::class.java)
            val passingObject=DataTransfer()
            val passingObject2=DataTransfer()
            passingObject.username=editText.text.toString();
            passingObject2.username=editText2.text.toString();
            intent.putExtra("object",passingObject)
            intent.putExtra("object2", passingObject2)
            startActivity(intent)
        }

    }
}







