package com.example.taskmgr;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findTask() {
        return null;
    }

    // Implement CRUD for tasks

}
