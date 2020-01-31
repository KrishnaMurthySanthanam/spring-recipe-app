package com.krishna.springrecipeapp.service;

import com.krishna.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
