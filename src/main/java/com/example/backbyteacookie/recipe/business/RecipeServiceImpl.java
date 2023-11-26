package com.example.backbyteacookie.recipe.business;

import com.example.backbyteacookie.recipe.domain.Recipe;
import com.example.backbyteacookie.recipe.persistence.RecipeDao;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeDao recipeDao;


    RecipeServiceImpl(RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }


    @Override
    public Optional<Recipe> findById(long id) {
        return recipeDao.findById(id);
    }


    @Override
    public List<Recipe> findAll() {
        return recipeDao.findAll();
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        recipeDao.delete(id);
    }

    @Override
    @Transactional
    public Recipe create(Recipe recipe) {
        return recipeDao.create(recipe);
    }

    @Override
    @Transactional
    public Recipe update(Recipe recipe) {
        return recipeDao.update(recipe);
    }

    @Override
    public List<Recipe> findByNameContaining(String name) {
        return recipeDao.findByNameContaining(name);
    }

    @Override
    public List<Recipe> findRecipesByClientId(long clientId) {
        return recipeDao.findRecipesByClientId(clientId);
    }
}
