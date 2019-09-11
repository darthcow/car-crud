package com.project.cars.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Car(
        @Id @GeneratedValue   var id: Long = 0,
        var name: String = "",
        var descrpition: String = "",
        var photo: String = "",
        var type: String = "",
        var year: Int = 0,
        var dateAdded: String = ""
)