package com.example.presentation.controller;

import com.example.domain.model.Todo;
import com.example.presentation.viewmodel.TodoResource;
import com.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/screen/todos")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping
    public List<TodoResource> getTodos() {
        Collection<Todo> todos = todoService.findAll();

        List<TodoResource> todoResources = new ArrayList<TodoResource>();
        for(Todo todo: todos) {
            todoResources.add(new TodoResource(todo));
        }
        return todoResources;
    }

    @PostMapping
    public TodoResource postTodos(@RequestBody @Validated TodoResource todoResource) {
        Todo createdTodo = todoService.create(todoResource.asTodo());
        TodoResource createdTodoResponse = new TodoResource(createdTodo);
        return createdTodoResponse;
    }

    @GetMapping("{todoId}")
    public TodoResource getTodo(@PathVariable("todoId") String todoId) {
        Todo todo = todoService.findOne(todoId);
        TodoResource todoResource = new TodoResource(todo);
        return todoResource;
    }
}
