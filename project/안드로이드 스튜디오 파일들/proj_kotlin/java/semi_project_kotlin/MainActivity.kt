package com.example.semi_project_kotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import org.jsoup.Jsoup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)  //자격증 찾아보기
        val btn2 = findViewById<Button>(R.id.btn2)  //컴공 관련 직종 보기

        btn1.setOnClickListener {
            // var : 변수값이 언제든지 변경될 수 있음
            // val : 자바에서는 final 값이 변경되지 못하는 변수.
            val intent = Intent(this, BrowseCertification::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, RelatedOccupation::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
            startActivity(intent)
        }

    }
}


