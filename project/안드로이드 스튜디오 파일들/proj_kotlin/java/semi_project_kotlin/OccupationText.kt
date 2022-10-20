package com.example.semi_project_kotlin

import android.app.Application

//data class CertificationText(val id_certificate: String)

data class OccupationText(val occupation_name: String,
                          val occupation_info: String,
                          val occupation_duty: String,
                          val occupation_salary: String,
                          val occupation_prospects: String,
                          val occupation_development_potential: String,
                          val occupation_employment_equality: String,
                          val occupation_Related_qualifications: String,
                          var expandable: Boolean = false)
