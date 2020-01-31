package com.krishna.springrecipeapp.service;

import com.krishna.springrecipeapp.domain.Recipe;
import com.krishna.springrecipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> set = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(set::add);
        return set;
    }
}
