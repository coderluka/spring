package com.coderluka.recipe.RecipeApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.coderluka.recipe.RecipeApp.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>
{

}
