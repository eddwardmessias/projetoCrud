package br.com.projetocrud.projetocrud.service;

import br.com.projetocrud.projetocrud.models.Product;
import br.com.projetocrud.projetocrud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAll(){

        return productRepository.findAll();
    }


    public Product save(Product product){

        return productRepository.save(product);

    }


    public Optional<Product> findById(Long id){


        return productRepository.findById(id);
    }

    public Product upade(Product product){

        return productRepository.save(product);
    }

    public void delete(Long id){

        productRepository.deleteById(id);
    }


}
