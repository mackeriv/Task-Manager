package com.example.taskmgr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/list")
    public Iterable<Task> retrieveTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Task findTaskById(@PathVariable Integer id) {
        return taskRepository.findTaskById(id);
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String title, @RequestParam String description) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        taskRepository.save(task);
        return "New task created!";
    }

}