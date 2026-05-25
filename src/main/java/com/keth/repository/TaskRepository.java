package com.keth.repository;

import com.keth.entity.Task;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class TaskRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Task> findAll() {
        return em.createQuery("SELECT t FROM Task t", Task.class)
                .getResultList();
    }

    public Task findById(Long id) {
        return em.find(Task.class, id);
    }

    @Transactional
    public void save(Task task) {
        em.persist(task);
    }

    @Transactional
    public void delete(Long id) {
        Task task = findById(id);
        if (task != null) {
            em.remove(task);
        }
    }

    @Transactional
    public void update(Task task) {
        em.merge(task);
    }
}