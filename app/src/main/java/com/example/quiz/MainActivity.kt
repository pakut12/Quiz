package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t = "";
        rdg.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButton) {
                t = radioButton.text.toString()
            }
            if (checkedId == R.id.radioButton2) {
                t = radioButton2.text.toString()
            }
            if (checkedId == R.id.radioButton3) {
                t = radioButton3.text.toString()
            }
            if (checkedId == R.id.radioButton4) {
                t = radioButton4.text.toString()
            }
        }
        val a = t.toString()
        button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("t1",t)
            startActivity(intent)
        }
        button2.setOnClickListener {
            rdg.clearCheck()
        }


    }
}