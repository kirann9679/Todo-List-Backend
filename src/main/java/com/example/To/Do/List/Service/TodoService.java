package com.example.To.Do.List.Service;

import com.example.To.Do.List.Model.Request.RequestTodo;
import com.example.To.Do.List.Model.Todo;
import org.springframework.stereotype.Component;

import java.util.List;
public interface TodoService {
    public List<Todo> getAllTodo();
    public List<Todo> saveTodo(RequestTodo requestTodo);
    public List<Todo> deleteTodo(int id);

}
