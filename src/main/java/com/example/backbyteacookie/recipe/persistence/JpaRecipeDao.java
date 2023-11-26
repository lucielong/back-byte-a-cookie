package com.example.backbyteacookie.recipe.persistence;

import com.example.backbyteacookie.recipe.domain.Recipe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaRecipeDao implements RecipeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Recipe> findById(long id) {
        Recipe recipe = entityManager.find(Recipe.class, id);
        return Optional.ofNullable(recipe);
    }

    @Override
    @Transactional
    public Recipe create(Recipe recipe) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(recipe);
        return recipe;
    }


    @Override
    @Transactional
    public Recipe update(Recipe recipe) {
        return entityManager.merge(recipe);
    }

    @Override
    @Transactional
    public void delete(long id) {
        Recipe recipe = entityManager.find(Recipe.class, id);
        entityManager.remove(recipe);
    }

    @Override
    public List<Recipe> findAll() {
        return entityManager.createQuery("SELECT r FROM Recipe r", Recipe.class)
                .getResultList();
    }

    @Override
    public List<Recipe> findByNameContaining(String name) {
        return entityManager.createQuery("SELECT r FROM Recipe r WHERE LOWER(r.name) LIKE CONCAT('%', LOWER(:name), '%')", Recipe.class)
                .setParameter("name", name)
                .getResultList();
    }

    @Override
    public List<Recipe> findRecipesByClientId(long clientId) {
        return entityManager.createQuery("SELECT r FROM Recipe r WHERE r.client.id = :clientId", Recipe.class)
                .setParameter("clientId", clientId)
                .getResultList();
    }
}
