package com.keth.controller;

import com.keth.entity.Task;
import com.keth.TaskService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.validation.Valid;

import java.util.List;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskController {

    @Inject
    private TaskService service;

    @GET
    public List<Task> getAll() {
        return service.getAll();
    }

    @GET
    @Path("/{id}")
    public Task getById(@PathParam("id") Long id) {
        return service.getById(id);
    }

    @POST
    public void create(@Valid Task task) {
        service.create(task);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        service.delete(id);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") Long id,
                       @Valid Task task) {
        task.setId(id);
        service.update(task);
    }
}