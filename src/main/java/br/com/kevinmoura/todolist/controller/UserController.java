package br.com.kevinmoura.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kevinmoura.todolist.entity.User;
import br.com.kevinmoura.todolist.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public List<User> create(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping
    public List<User> update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping(value = "{id}")
    public List<User> delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

    @GetMapping
    public List<User> list() {
        return userService.list();
    }
}
