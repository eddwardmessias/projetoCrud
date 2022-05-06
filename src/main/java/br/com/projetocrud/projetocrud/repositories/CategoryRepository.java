package br.com.projetocrud.projetocrud.repositories;


import br.com.projetocrud.projetocrud.models.Category;
import br.com.projetocrud.projetocrud.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long > {


}
