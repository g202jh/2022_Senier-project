package com.example.semi_project_kotlin

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.*
import androidx.recyclerview.widget.RecyclerView
import com.example.semi_project_kotlin.databinding.OccupRowBinding
import com.example.semi_project_kotlin.databinding.RowBinding
import kotlin.jvm.java as java


class OccupationAdapter(private val occupationList: List<OccupationText>) : RecyclerView.Adapter<OccupationAdapter.CustomViewHolder>()
{
    inner class CustomViewHolder(val viewDataBinding: OccupRowBinding):RecyclerView.ViewHolder(viewDataBinding.root)
    {
        var linearLayout2 : LinearLayout = itemView.findViewById((R.id.linearLayout2))
        var expandableLayout2: RelativeLayout = itemView.findViewById(R.id.expandable_layout2)
        fun bindItem(task:OccupationText){
            viewDataBinding.occupationName.text = task.occupation_name
            viewDataBinding.occupationInfo.text = task.occupation_info
            viewDataBinding.occupationDuty.text = task.occupation_duty
            viewDataBinding.occupationSalary.text = task.occupation_salary
            viewDataBinding.occupationProspects.text = task.occupation_prospects
            viewDataBinding.occupationDevelopmentPotential.text = task.occupation_development_potential
            viewDataBinding.occupationEmploymentEquality.text = task.occupation_employment_equality
            viewDataBinding.occupationRelatedQualifications.text = task.occupation_Related_qualifications
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder
    {
        val binding = OccupRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return occupationList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int)
    {
        val task : OccupationText = occupationList[position]
        holder.bindItem(task)
        holder.viewDataBinding.occupationName.text = task.occupation_name
        holder.viewDataBinding.occupationInfo.text = task.occupation_info
        holder.viewDataBinding.occupationDuty.text = task.occupation_duty
        holder.viewDataBinding.occupationSalary.text = task.occupation_salary
        holder.viewDataBinding.occupationProspects.text = task.occupation_prospects
        holder.viewDataBinding.occupationDevelopmentPotential.text = task.occupation_development_potential
        holder.viewDataBinding.occupationEmploymentEquality.text = task.occupation_employment_equality
        holder.viewDataBinding.occupationRelatedQualifications.text = task.occupation_Related_qualifications

        val isExpandble : Boolean = task.expandable
        holder.expandableLayout2.visibility = if (isExpandble) View.VISIBLE else View.GONE
        holder.linearLayout2.setOnClickListener {
            val task = occupationList[position]
            task.expandable = !task.expandable
            notifyItemChanged(position)
        }
    }
}