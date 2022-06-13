package com.adelsarami.taskmanager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class TaskmanagerApplication

fun main(args: Array<String>) {
	runApplication<TaskmanagerApplication>(*args)
}
