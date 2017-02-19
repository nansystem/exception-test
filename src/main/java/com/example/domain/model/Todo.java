package com.example.domain.model;

import java.util.Date;

public class Todo {

    public String id;
    public String title;
    public boolean finished;
    public Date createdAt;

    public Todo(String id, String title, boolean finished, Date createdAt) {
        this.id = id;
        this.title = title;
        this.finished = finished;
        this.createdAt = createdAt;
    }
}
