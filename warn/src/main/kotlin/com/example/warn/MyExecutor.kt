package com.example.warn

import org.springframework.core.task.TaskExecutor

class MyExecutor : TaskExecutor {
    override fun execute(task: Runnable?) {
    }
}
