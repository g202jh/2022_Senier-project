package com.example.semi_project_kotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.semi_project_kotlin.databinding.ActivityBrowseCertificationBinding
import com.example.semi_project_kotlin.databinding.ActivityQnetWebviewBinding
import com.example.semi_project_kotlin.databinding.RowBinding
import android.widget.Button

class BrowseCertification : AppCompatActivity()
{
    private val certificationList = ArrayList<CertificationText>()
    private lateinit var binding: ActivityBrowseCertificationBinding
//    private lateinit var webbinding : ActivityQnetWebviewBinding
    private lateinit var subbinding : RowBinding

    override fun onCreate(savedInstancedState: Bundle?)
    {
        super.onCreate(savedInstancedState)
        binding = ActivityBrowseCertificationBinding.inflate(layoutInflater) // 클래스 객체화
        setContentView(binding.root) //화면 표시

        val adapter = CertificationAdapter(TaskList.taskList)
        binding.rvCertification.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvCertification.adapter = adapter

//        webbinding = ActivityQnetWebviewBinding.inflate(layoutInflater)
//        webbinding.webView.setOnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.q-net.or.kr/man001.do?gSite=Q"))
//            startActivity(intent)
//        }


//        subbinding = RowBinding.inflate(layoutInflater)
//
//        subbinding.certificateApplication.setOnClickListener{
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.q-net.or.kr/man001.do?gSite=Q"))
//            startActivity(intent)
//        }


//        val certificate_application = findViewById<TextView>(R.id.certificate_application)
//        certificate_application.setOnClickListener {
//            val intent = Intent(this, QnetWebView::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
//            startActivity(intent)
//        }

//        initData()
//        setRecyclerView()

//        binding.rvCertification.setOnClickListener
//        {
//            if (binding.expandableLayout.visbility == View.VISIBLE) {
//                binding.e.visibility = View.GONE
//                binding.imgMore1.animate().setDuration(200).rotation(180f)
//            } else {
//                binding.layoutExpand1.visibility = View.VISIBLE
//                binding.imgMore1.animate().setDuration(200).rotation(0f)
//            }
//        }

        

    }
//    private fun setRecyclerView(){
//        val certificationAdapter = CertificationAdapter(certificationList)
//        recyclerView.adapter = certificationAdapter
//        recyclerView.setHasFixedSize(True)
//    }
//
//    private fun initData(){
//        certificationList.add(
//            CertificationText(
//            "정보처리기능사",
//            "정보처리기능사 정보...",
//            "시험 날짜",
//            "남은 날짜"
//            )
//        )
//    }
}