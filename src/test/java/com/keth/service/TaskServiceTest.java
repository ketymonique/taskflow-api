package com.keth.service;

import com.keth.TaskService;
import com.keth.entity.Task;
import com.keth.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository repository;

    @InjectMocks
    private TaskService service;

    @Test
    void shouldCreateTask() {

        Task task = new Task();
        task.setTitle("Estudar Java");
        task.setDescription("Aprender testes");

        service.create(task);

        verify(repository, times(1)).save(task);
    }
}