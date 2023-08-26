package br.com.kevinmoura.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kevinmoura.todolist.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
