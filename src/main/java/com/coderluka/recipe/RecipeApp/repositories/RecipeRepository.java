package com.coderluka.recipe.RecipeApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.coderluka.recipe.RecipeApp.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>
{

}
