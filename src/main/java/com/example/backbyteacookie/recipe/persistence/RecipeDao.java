package com.example.backbyteacookie.recipe.persistence;

import com.example.backbyteacookie.recipe.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface RecipeDao {

    Optional<Recipe> findById(long id);

    Recipe create(Recipe recipe);

    Recipe update(Recipe recipe);

    void delete(long id);

    List<Recipe> findAll();

    List<Recipe> findByNameContaining(String name);

    List<Recipe> findRecipesByClientId(long clientId);

}
