package com.example.service;

import com.example.domain.model.Todo;
import com.example.error.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class TodoService {

    static List<Todo> list = new ArrayList<>();
    static{
        list.add(new Todo("1", "牛乳を買う", false, Date.valueOf(LocalDate.now())));
        list.add(new Todo("2", "ジムに行く", true, Date.valueOf(LocalDate.now())));
        list.add(new Todo("3", "おむつを替える", false, Date.valueOf(LocalDate.now())));
        list.add(new Todo("4", "昼寝する", false, Date.valueOf(LocalDate.now())));
    }
    public Collection<Todo> findAll() {
        return list;
    }

    public Todo create(Todo todo) {
        return new Todo("5", "散歩する", false, Date.valueOf(LocalDate.now()));
    }

    public Todo findOne(String todoId) {
        throw new ResourceNotFoundException(String.format("todo not found. todoId : [%s]", todoId));
//        for(Todo todo:list) {
//            if(todo.id.equals(todoId)) return todo;
//        }
//        return null;
    }
}
