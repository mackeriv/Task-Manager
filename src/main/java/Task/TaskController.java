package Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/add")
    public String addTask(@RequestParam String title, @RequestParam String description, @RequestParam (defaultValue = "false") boolean completed) {
        Task task = new Task();

        task.setTitle(title);
        task.setDescription(description);
        task.setCompleted(completed);
        taskRepository.save(task);
        return "New task created!";
    }

    @GetMapping("/list")
    public Iterable<Task> retrieveTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Task findTaskById(@PathVariable Integer id) {
        return taskRepository.findTaskById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTaskById(@PathVariable Integer id) {
        taskRepository.deleteById(id);
        return "Task successfully deleted.";
    }

}