package br.com.kevinmoura.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.kevinmoura.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
