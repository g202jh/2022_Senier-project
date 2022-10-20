package com.example.semi_project_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.semi_project_kotlin.databinding.ActivityBrowseCertificationBinding
import com.example.semi_project_kotlin.databinding.ActivityRelatedOccupationBinding
import com.example.semi_project_kotlin.databinding.RowBinding

class RelatedOccupation : AppCompatActivity() {
//    private val OccupationList = ArrayList<OccupationText>()
    private lateinit var binding2: ActivityRelatedOccupationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityRelatedOccupationBinding.inflate(layoutInflater) // 클래스 객체화
        setContentView(binding2.root) //화면 표시

        val adapter = OccupationAdapter(OccupationList.occupationList)
        binding2.rvOccupation.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding2.rvOccupation.adapter = adapter
    }

}