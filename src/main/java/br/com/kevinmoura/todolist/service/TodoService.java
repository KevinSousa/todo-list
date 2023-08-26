package br.com.kevinmoura.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.kevinmoura.todolist.entity.Todo;
import br.com.kevinmoura.todolist.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return this.list();
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return this.list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return this.list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }
}
