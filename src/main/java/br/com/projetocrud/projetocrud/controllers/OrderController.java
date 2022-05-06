package br.com.projetocrud.projetocrud.controllers;

import br.com.projetocrud.projetocrud.models.Order;
import br.com.projetocrud.projetocrud.models.User;
import br.com.projetocrud.projetocrud.service.OrderService;
import br.com.projetocrud.projetocrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @Autowired
    private OrderService orderService;


    @GetMapping
    public List<Order> findAll(){

        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable Long id){

        return orderService.findById(id);
    }

    @PostMapping
    public Order save(@RequestBody Order order){

        return orderService.save(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        orderService.delete(id);
    }

    @PutMapping
    public Order update(@RequestBody Order order){

        return orderService.upade(order);
    }





}
