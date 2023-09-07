package com.example.taskmgr;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

    // Define custom query methods if needed


}
