package br.com.projetocrud.projetocrud.controllers;

import br.com.projetocrud.projetocrud.models.Category;
import br.com.projetocrud.projetocrud.models.User;
import br.com.projetocrud.projetocrud.service.CategoryService;
import br.com.projetocrud.projetocrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {


    @Autowired
    private CategoryService categoryServiceService;


    @GetMapping
    public List<Category> findAll(){

        return categoryServiceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> findById(@PathVariable Long id){

        return categoryServiceService.findById(id);
    }

    @PostMapping
    public Category save(@RequestBody Category category){

        return categoryServiceService.save(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        categoryServiceService.delete(id);
    }

    @PutMapping
    public Category update(@RequestBody Category category){

        return categoryServiceService.upade(category);
    }





}
