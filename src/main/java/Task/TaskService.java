package Task;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskService {

    @Autowired
    private TaskController TaskController;

    public List<Task> findTask() {
        return null;
    }

    // Implement methods for tasks

}
