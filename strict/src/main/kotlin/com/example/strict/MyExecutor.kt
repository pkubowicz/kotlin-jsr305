package com.example.strict

import org.springframework.core.task.TaskExecutor

class MyExecutor : TaskExecutor {
    override fun execute(task: Runnable?) {
    }
}
