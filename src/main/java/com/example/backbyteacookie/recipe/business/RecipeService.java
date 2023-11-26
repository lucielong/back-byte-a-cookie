package com.example.backbyteacookie.recipe.business;

import com.example.backbyteacookie.recipe.domain.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeService {

    Optional<Recipe> findById(long id);

    List<Recipe> findAll();

    void deleteById(long id);

    Recipe create(Recipe recipe);

    Recipe update(Recipe recipe);

    List<Recipe> findByNameContaining(String name);

    List<Recipe> findRecipesByClientId(long clientId);
}
