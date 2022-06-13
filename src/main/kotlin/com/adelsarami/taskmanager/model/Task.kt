package com.adelsarami.taskmanager.model
import javax.persistence.Entity

@Entity()
data class Task(

        @javax.persistence.Id
        var id: Int,

        var title: String,
        var description: String,
        var url: String,
        var date: String,
        var time: String,
        var state: String
) {
        constructor() : this(0 , "" ," " , "" , "" , "" , "")
}