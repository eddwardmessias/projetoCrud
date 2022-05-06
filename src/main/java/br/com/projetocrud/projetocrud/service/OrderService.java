package br.com.projetocrud.projetocrud.service;

import br.com.projetocrud.projetocrud.models.Order;
import br.com.projetocrud.projetocrud.models.User;
import br.com.projetocrud.projetocrud.repositories.OrderRepository;
import br.com.projetocrud.projetocrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List<Order> findAll(){

        return orderRepository.findAll();
    }


    public Order save(Order order){

        return orderRepository.save(order);

    }


    public Optional<Order> findById(Long id){


        return orderRepository.findById(id);
    }

    public Order upade(Order order){

        return orderRepository.save(order);
    }

    public void delete(Long id){

        orderRepository.deleteById(id);
    }


}
