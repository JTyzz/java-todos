package com.jasontyzzer.javatodos.repos;

import com.jasontyzzer.javatodos.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer>
{
}