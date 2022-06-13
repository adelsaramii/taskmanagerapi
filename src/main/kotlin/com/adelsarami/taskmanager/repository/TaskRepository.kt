package com.adelsarami.taskmanager.repository

import com.adelsarami.taskmanager.model.Task
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository :CrudRepository<Task , Int>{
}