package br.com.projetocrud.projetocrud.controllers;

import br.com.projetocrud.projetocrud.models.Product;
import br.com.projetocrud.projetocrud.models.User;
import br.com.projetocrud.projetocrud.service.ProductService;
import br.com.projetocrud.projetocrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductService productService;


    @GetMapping
    public List<Product> findAll(){

        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Long id){

        return productService.findById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product){

        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        productService.delete(id);
    }

    @PutMapping
    public Product update(@RequestBody Product product){

        return productService.upade(product);
    }





}
