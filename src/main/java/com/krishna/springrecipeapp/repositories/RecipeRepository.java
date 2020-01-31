package com.krishna.springrecipeapp.repositories;

import com.krishna.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
