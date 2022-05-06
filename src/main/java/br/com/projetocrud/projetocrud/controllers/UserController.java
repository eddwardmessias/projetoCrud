package br.com.projetocrud.projetocrud.controllers;

import br.com.projetocrud.projetocrud.models.User;
import br.com.projetocrud.projetocrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> findAll(){

        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id){

        return userService.findById(id);
    }

    @PostMapping
    public User save(@RequestBody User user){

        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        userService.delete(id);
    }

    @PutMapping
    public User update(@RequestBody User user){

        return userService.upade(user);
    }





}
