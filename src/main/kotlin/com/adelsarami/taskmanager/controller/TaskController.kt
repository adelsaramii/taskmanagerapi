package com.adelsarami.taskmanager.controller

import com.adelsarami.taskmanager.model.Task
import com.adelsarami.taskmanager.repository.TaskRepository
import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class TaskController {
    lateinit var taskRepository : TaskRepository

    @Autowired
    fun injectRepository(mTaskRepository: TaskRepository){
        taskRepository = mTaskRepository
    }

    @GetMapping("/task")
    fun getAllTask() :ResponseEntity<MutableIterable<Task>>{
        val data = taskRepository.findAll()
        return ResponseEntity.ok(data)
    }

    @PostMapping("/task/insert")
    fun insertTask(@RequestBody data: String) {

        val gson = Gson()
        val newTask = gson.fromJson<Task>(data, Task::class.java)

        taskRepository.save(newTask)
    }


    @PutMapping("/task/updating")
    fun updateTask( @RequestBody body: String) {

        val gson = Gson()
        val newTask: Task = gson.fromJson(body, Task::class.java)

        taskRepository.save(newTask)

    }


    @DeleteMapping("/task/deleting{id}")
    fun deleteTask( @PathVariable("id") id:Int ) {

        taskRepository.deleteById(id)

    }

    @DeleteMapping("/task/deleteAll")
    fun deleteAllTask() {

        taskRepository.deleteAll()

    }

}