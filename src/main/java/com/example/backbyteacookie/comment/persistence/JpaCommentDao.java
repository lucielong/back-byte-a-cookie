package com.example.backbyteacookie.comment.persistence;

import com.example.backbyteacookie.comment.domain.Comment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaCommentDao implements CommentDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Comment> findAll() {
        return entityManager.createQuery("SELECT c FROM Comment c", Comment.class)
                .getResultList();
    }

    @Override
    public Comment findById(long id) {
        return entityManager.find(Comment.class, id);
    }

    @Override
    public Comment create(Comment comment) {
        entityManager.persist(comment);
        return comment;
    }

    @Override
    public Comment update(Comment comment) {
        return entityManager.merge(comment);
    }

    @Override
    public void delete(long id) {
        Comment comment = entityManager.find(Comment.class, id);
        entityManager.remove(comment);
    }

    @Override
    public List<Comment> findByRecipeId(long recipeId) {
        return entityManager.createQuery("SELECT c FROM Comment c WHERE c.recipe.id = :recipeId", Comment.class)
                .setParameter("recipeId", recipeId)
                .getResultList();
    }

    @Override
    public double ratingAverage(long recipeId) {
        try {
            return entityManager.createQuery("SELECT AVG(c.rating) FROM Comment c WHERE c.recipe.id = :recipeId", Double.class)
                    .setParameter("recipeId", recipeId)
                    .getSingleResult();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    @Override
    public Long count(long recipeId) {
        return entityManager.createQuery("SELECT COUNT(c) FROM Comment c WHERE c.recipe.id = :recipeId", Long.class)
                .setParameter("recipeId", recipeId)
                .getSingleResult();
    }

}
