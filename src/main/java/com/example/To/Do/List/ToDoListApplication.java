package com.example.To.Do.List;

import com.example.To.Do.List.Repository.TodoRepository;
import com.example.To.Do.List.Service.Impl.TodoServiceImpl;
import com.example.To.Do.List.Service.TodoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}
@Bean
	public TodoService getTodoService() {
	return new TodoServiceImpl();
}
}

