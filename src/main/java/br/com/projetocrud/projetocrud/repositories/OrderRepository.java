package br.com.projetocrud.projetocrud.repositories;


import br.com.projetocrud.projetocrud.models.Order;
import br.com.projetocrud.projetocrud.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long > {


}
