package com.example.To.Do.List.Controller;

import com.example.To.Do.List.Model.Request.RequestTodo;
import com.example.To.Do.List.Model.Todo;
import com.example.To.Do.List.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoController {
    @Autowired
    TodoService todoService;
   @GetMapping("/getalltodos")
   public List<Todo> getAllTodo() {
       return todoService.getAllTodo();
   }
   @PostMapping("/savetodo")
   public List<Todo> saveTodo(@RequestBody RequestTodo requestTodo){
       return todoService.saveTodo(requestTodo);
   }
    @DeleteMapping("/deletetodo/{id}")
    public List<Todo> deleteTodo(@PathVariable int id){
       return todoService.deleteTodo(id);
    }
}
