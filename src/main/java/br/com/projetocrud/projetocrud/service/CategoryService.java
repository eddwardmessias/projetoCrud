package br.com.projetocrud.projetocrud.service;

import br.com.projetocrud.projetocrud.models.Category;
import br.com.projetocrud.projetocrud.models.User;
import br.com.projetocrud.projetocrud.repositories.CategoryRepository;
import br.com.projetocrud.projetocrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;



    public List<Category> findAll(){

        return categoryRepository.findAll();
    }


    public Category save(Category category){

        return categoryRepository.save(category);

    }


    public Optional<Category> findById(Long id){


        return categoryRepository.findById(id);
    }

    public Category upade(Category category){

        return categoryRepository.save(category);
    }

    public void delete(Long id){

        categoryRepository.deleteById(id);
    }


}
