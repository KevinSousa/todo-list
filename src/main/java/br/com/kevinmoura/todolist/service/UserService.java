package br.com.kevinmoura.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.kevinmoura.todolist.entity.User;
import br.com.kevinmoura.todolist.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> create(User user) {
        userRepository.save(user);
        return this.list();
    }

    public List<User> update(User user) {
        userRepository.save(user);
        return this.list();
    }

    public List<User> delete(Long id) {
        userRepository.deleteById(id);
        return this.list();
    }

    public List<User> list() {
        Sort sort = Sort.by("nome").ascending();
        return userRepository.findAll(sort);
    }
}
