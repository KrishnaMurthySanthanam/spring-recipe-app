package com.krishna.springrecipeapp.controllers;

import com.krishna.springrecipeapp.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllers {

    private final RecipeService recipeService;

    public IndexControllers(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"","/", "/index"})
    public String getIndex(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
