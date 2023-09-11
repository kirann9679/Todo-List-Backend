package com.example.To.Do.List.Service.Impl;

import com.example.To.Do.List.Model.Request.RequestTodo;
import com.example.To.Do.List.Model.Todo;
import com.example.To.Do.List.Repository.TodoRepository;
import com.example.To.Do.List.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoRepository;
    @Autowired
    Todo todo;
    @Override
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> deleteTodo(int id) {
        todoRepository.deleteById(id);
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> saveTodo(RequestTodo requestTodo) {
        todo.setText(requestTodo.getText());
        todoRepository.save(todo);
        return todoRepository.findAll();
    }
}
