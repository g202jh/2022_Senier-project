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
import com.example.semi_project_kotlin.databinding.RowBinding
import kotlin.jvm.java as java


class CertificationAdapter(private val taskList: List<CertificationText>) : RecyclerView.Adapter<CertificationAdapter.CustomViewHolder>()
{
    inner class CustomViewHolder(val viewDataBinding: RowBinding):RecyclerView.ViewHolder(viewDataBinding.root)
    {
        var linearLayout : LinearLayout = itemView.findViewById((R.id.linearLayout))
        var expandableLayout: RelativeLayout = itemView.findViewById(R.id.expandable_layout)
        var certificationApplication: Button = itemView.findViewById(R.id.certificate_application)
        fun bindItem(task:CertificationText){
            viewDataBinding.certificateName.text = task.certificateName
            viewDataBinding.certificateInfo.text = task.certificateInfo
            viewDataBinding.certificatePass.text = task.certificatePass
            viewDataBinding.certificateMaterials.text = task.certificateMaterials
            viewDataBinding.certificateQualifications.text = task.certificateQualifications
            viewDataBinding.certificateFee.text = task.certificateFee
            viewDataBinding.certificateApplication.text = task.certificateApplication
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder
    {
        val binding = RowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int)
    {
        val task : CertificationText = taskList[position]
        holder.bindItem(task)
        holder.viewDataBinding.certificateName.text = task.certificateName
        holder.viewDataBinding.certificateInfo.text = task.certificateInfo
        holder.viewDataBinding.certificatePass.text = task.certificatePass
        holder.viewDataBinding.certificateMaterials.text = task.certificateMaterials
        holder.viewDataBinding.certificateQualifications.text = task.certificateQualifications
        holder.viewDataBinding.certificateFee.text = task.certificateFee
        holder.viewDataBinding.certificateApplication.text = task.certificateApplication

        val isExpandble : Boolean = task.expandable
        holder.expandableLayout.visibility = if (isExpandble) View.VISIBLE else View.GONE
        holder.linearLayout.setOnClickListener {
            val task = taskList[position]
            task.expandable = !task.expandable
            notifyItemChanged(position)
        }
        holder.viewDataBinding.certificateApplication.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.q-net.or.kr/man001.do?gSite=Q"))
            startActivity(holder.certificationApplication.context, intent, null)
        }
    }
}