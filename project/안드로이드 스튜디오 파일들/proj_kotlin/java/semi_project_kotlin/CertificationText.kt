package com.example.semi_project_kotlin

import android.app.Application

//data class CertificationText(val id_certificate: String)

data class CertificationText(val certificateName: String,
                             val certificateInfo: String,
                             val certificatePass: String,
                             val certificateMaterials: String,
                             val certificateQualifications: String,
                             val certificateFee: String,
                             val certificateApplication: String,
                             var expandable: Boolean = false)
