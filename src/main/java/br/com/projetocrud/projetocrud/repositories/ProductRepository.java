package br.com.projetocrud.projetocrud.repositories;


import br.com.projetocrud.projetocrud.models.Category;
import br.com.projetocrud.projetocrud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long > {


}
