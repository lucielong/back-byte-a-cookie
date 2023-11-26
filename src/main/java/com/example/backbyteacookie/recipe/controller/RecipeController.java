package com.example.backbyteacookie.recipe.controller;

import com.example.backbyteacookie.recipe.business.RecipeService;
import com.example.backbyteacookie.recipe.domain.Recipe;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("recipes")
@RestController
@RequiredArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;

    @GetMapping("")
    @Operation(summary = "Get a list of all existing recipes")
    public List<Recipe> listRecipes() {
        return recipeService.findAll();
    }

    @PostMapping("")
    @Transactional
    @Operation(summary = "Create a new recipe")
    public void addRecipe(@RequestBody Recipe recipe) {
        recipeService.create(recipe);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a specific recipe by its ID")
    public Optional<Recipe> getRecipeById(@PathVariable Long id) {
        return recipeService.findById(id);
    }

    @GetMapping("/searchByClient/{id}")
    @Operation(summary = "Search recipes by author")
    public List<Recipe> searchRecipesByClientId(@PathVariable Long id) {
        return recipeService.findRecipesByClientId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove a given recipe")
    public void deleteRecipe(@PathVariable Long id) {
        recipeService.deleteById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Edit a given recipe")
    public void updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id) {
        recipeService.update(recipe);
    }

    @PutMapping(value = "/{id}/picture", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @Transactional
    @Operation(summary = "Change a given recipe's illustration")
    public void setIllustration(@PathVariable Long id) {
    }

    @GetMapping("/search")
    @Operation(summary = "Search recipes by name")
    public List<Recipe> searchRecipesByName(@RequestParam String name) {
        return recipeService.findByNameContaining(name);
    }


}