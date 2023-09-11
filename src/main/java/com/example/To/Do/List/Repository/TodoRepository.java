package com.example.To.Do.List.Repository;

import com.example.To.Do.List.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Integer> {
}
