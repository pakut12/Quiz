package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = getIntent()
        var name = intent.getStringExtra("t1")
        if (name == "") {
            val s = Intent(this, MainActivity::class.java)
            startActivity(s)
        } else {
            if (name == "Mark Zuckerberg") {
                Toast.makeText(this, name.toString() + " ถูกต้อง", Toast.LENGTH_SHORT).show()
                textView.setText("ถูกต้อง")
            } else {
                Toast.makeText(this, "ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
                textView3.setText("ไม่ถูกต้อง")
            }


            button3.setOnClickListener {
                val s = Intent(this, MainActivity::class.java)
                startActivity(s)
            }
        }

    }
}