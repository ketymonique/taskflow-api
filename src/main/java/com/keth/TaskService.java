package com.keth;

import com.keth.entity.Task;
import com.keth.repository.TaskRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class TaskService {

    @Inject
    private TaskRepository repository;

    public List<Task> getAll() {
        return repository.findAll();
    }

    public Task getById(Long id) {
        return repository.findById(id);
    }

    public void create(Task task) {
        repository.save(task);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    public void update(Task task) {
        repository.update(task);
    }
}