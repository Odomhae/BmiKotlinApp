package com.example.kotlinsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            // 버튼이 클릭됫을때 실행
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }

        button2.setOnClickListener{
            // 버튼이 클릭됫을때 실행
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }
    }
}
